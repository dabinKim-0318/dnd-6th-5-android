package com.fork.spoonfeed.presentation.ui.mypage.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.fork.spoonfeed.data.UserData
import com.fork.spoonfeed.data.remote.model.community.RequestDeleteCommentData
import com.fork.spoonfeed.data.remote.model.user.RequestQuestionData
import com.fork.spoonfeed.data.remote.model.user.ResponseUserCommentData
import com.fork.spoonfeed.data.remote.model.user.ResponseUserPostData
import com.fork.spoonfeed.data.remote.model.user.ResponseUserUserLikePolicyData
import com.fork.spoonfeed.domain.repository.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MyPageViewModel @Inject constructor(
    private val questionRepository: QuestionRepository,
    private val commentRepository: CommentRepository,
    private val postRepository: PostRepository,
    private val authRepository: AuthRepository,
    private val userRepository: UserRepository
) : ViewModel() {
    private val _isQuestionValid = MutableLiveData(false)
    val isQuestionValid: LiveData<Boolean>
        get() = _isQuestionValid

    private val _email = MutableLiveData<String>()
    val email: LiveData<String>
        get() = _email

    private val _sentence = MutableLiveData<String>()
    val sentence: LiveData<String>
        get() = _sentence

    private val _myPostList = MutableLiveData<List<ResponseUserPostData.Data.Post?>>()
    val myPostList: LiveData<List<ResponseUserPostData.Data.Post?>> =
        _myPostList

    private val _isMyPostEmpty = MutableLiveData(true)
    val isMyPostEmpty: LiveData<Boolean>
        get() = _isMyPostEmpty

    private val _myCommentList = MutableLiveData<List<ResponseUserCommentData.Data.Comment?>>()
    val myCommentList: LiveData<List<ResponseUserCommentData.Data.Comment?>> =
        _myCommentList

    private val _isMyCommentEmpty = MutableLiveData(true)
    val isMyCommentEmpty: LiveData<Boolean>
        get() = _isMyCommentEmpty

    private val _myInterastedtPoLicyList = MutableLiveData<List<ResponseUserUserLikePolicyData.Data.Policy>>()
    val myInterastedtPoLicyList: LiveData<List<ResponseUserUserLikePolicyData.Data.Policy>>
        get() = _myInterastedtPoLicyList

    private val _isMyInterastedPolicyEmpty = MutableLiveData(true)
    val isMyInterastedPolicyEmpty: LiveData<Boolean>
        get() = _isMyInterastedPolicyEmpty

    private val _deletePostSuccess = MutableLiveData(false)
    val deletePostSuccess: LiveData<Boolean>
        get() = _deletePostSuccess

    private val _deleteCommentSuccess = MutableLiveData(false)
    val deleteCommentSuccess: LiveData<Boolean>
        get() = _deleteCommentSuccess

    private val _postQuestionSuccess = MutableLiveData(false)
    val postQuestionSuccess: LiveData<Boolean>
        get() = _postQuestionSuccess

    private val _userNickName = MutableLiveData<String>()
    val userNickName: LiveData<String> = _userNickName

    fun postBtnEnable(isEnable: Boolean) {
        _isQuestionValid.value = isEnable
    }

    fun logoutWithKakao() {
        viewModelScope.launch {
            authRepository.logoutWithKakao(UserData.accessToken!!)
        }
    }

    fun getMyPost() {
        viewModelScope.launch {
            _myPostList.value = userRepository.getUserPost(UserData.accessToken!!, UserData.platform!!, UserData.id!!).data.post
            _isMyPostEmpty.value = _myPostList.value!![0]?.title.isNullOrEmpty() == true
        }
    }


    fun getMyComment() {
        viewModelScope.launch {
            _myCommentList.value = userRepository.getUserComment(UserData.accessToken!!, UserData.platform!!, UserData.id!!).data.comment
            _isMyCommentEmpty.value = _myCommentList.value?.isNullOrEmpty() == true
        }
    }

    fun deleteMyPost(postId: Int) {
        viewModelScope.launch {
            _deletePostSuccess.value = postRepository.deletePost(postId).success
        }
    }

    fun deleteMyComment(postId: Int, commentId: String) {
        val requestDeleteCommentData = RequestDeleteCommentData(commentId.toInt())
        viewModelScope.launch {
            _deleteCommentSuccess.value = commentRepository.deleteComment(postId, requestDeleteCommentData).success
        }
    }

    fun getMyInterastedPolicy() {
        viewModelScope.launch {
            _myInterastedtPoLicyList.value = userRepository.getUserLikePolicy(UserData.accessToken!!, UserData.platform!!, UserData.id!!).data.policy
        }
    }

    fun getNickName() {
        viewModelScope.launch {
            _userNickName.value = userRepository.getUserData().data.user.nickname
        }
    }

    fun postQuestion(content: String, email: String) {
        val requestPostQuestionRepository = RequestQuestionData(
            userId = UserData.id.toString(),
            title = "",
            content = content,
            email = email
        )
        viewModelScope.launch {
            _postQuestionSuccess.value = questionRepository.postQuestion(requestPostQuestionRepository).success
        }
    }
}
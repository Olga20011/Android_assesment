package com.example.android_assesment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    lateinit var numOne:EditText
    lateinit var numTwo:EditText
    lateinit var Answer:EditText
    lateinit var btnAdd:Button
    lateinit var btnSub:Button
    lateinit var btnMutliply:Button
    lateinit var btnDivide:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Addition(){
        btnAdd.setOnClickListener {

        }

        var retrofit=ApiClient.buildApiClient(ApiInterface::class.java)
        var request=retrofit.additon()
        request.enqueue(object : Callback<Numbers?> {
            override fun onResponse(call: Call<Numbers?>, response: Response<Numbers?>) {

            }
            override fun onFailure(call: Call<Numbers?>, t: Throwable) {

            }
        })

    }
//    fun Subtraction(){
//        var retrofit=ApiClient.buildApiClient(ApiInterface::class.java)
//        var request=retrofit.additon()
//        request.enqueue(object : Callback<Numbers?> {
//            override fun onResponse(call: Call<Numbers?>, response: Response<Numbers?>) {
//
//            }
//            override fun onFailure(call: Call<Numbers?>, t: Throwable) {
//
//            }
//        })
//
//    }
//    fun Division(){
//        var retrofit=ApiClient.buildApiClient(ApiInterface::class.java)
//        var request=retrofit.additon()
//        request.enqueue(object : Callback<Numbers?> {
//            override fun onResponse(call: Call<Numbers?>, response: Response<Numbers?>) {
//
//            }
//            override fun onFailure(call: Call<Numbers?>, t: Throwable) {
//
//            }
//        })
//
//    }
//   fun Multiplication(){
//        var retrofit=ApiClient.buildApiClient(ApiInterface::class.java)
//        var request=retrofit.additon()
//        request.enqueue(object : Callback<Numbers?> {
//            override fun onResponse(call: Call<Numbers?>, response: Response<Numbers?>) {
//
//            }
//            override fun onFailure(call: Call<Numbers?>, t: Throwable) {
//
//            }
//        })
//
//    }
}
//if (response.isSuccessful){
//    var postList=response.body()!!
//    var postAdapter=PostsRecyclerViewAdapter(postList,baseContext)
//    postView.adapter=postAdapter
//    postView.layoutManager= LinearLayoutManager(baseContext)
//    Toast.makeText(baseContext,postList!!.size.toString(), Toast.LENGTH_LONG).show()
//}

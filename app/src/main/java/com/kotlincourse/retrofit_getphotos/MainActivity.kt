package com.kotlincourse.retrofit_getphotos

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.kotlincourse.retrofit_getphotos.`interface`.InterfacePhotos
import com.kotlincourse.retrofit_getphotos.models.PhotosList
import com.kotlincourse.retrofit_getphotos.services.ServiceBuilder.buildService
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Response

class MainActivity : AppCompatActivity() {






    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //recyclerview1.layoutManager = LinearLayoutManager(this@MainActivity)

        val request = buildService(InterfacePhotos::class.java)

        val call = request.getPhotos()
       //call.execute().body()



        call.enqueue(object: retrofit2.Callback<PhotosList>{
            override fun onFailure(call: Call<PhotosList>, t: Throwable) {
                Toast.makeText(this@MainActivity, "Error", Toast.LENGTH_SHORT).show()
            }

            override fun onResponse(call: Call<PhotosList>, response: Response<PhotosList>) {
                if (response.isSuccessful){


                    Log.v("TAG", "Sucesful")
                    Toast.makeText(this@MainActivity, "exitoso", Toast.LENGTH_SHORT).show()
                       recyclerview1.layoutManager = LinearLayoutManager(this@MainActivity)
                    val print = response.body()
                    println(print)

                }
            }

        })




    }

}


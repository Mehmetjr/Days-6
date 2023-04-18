package com.example.days_6.adapter

import android.app.Activity
import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.days_6.R
import com.example.days_6.models.User
import org.w3c.dom.Text

class UserCustomAdapter(private val context: Activity, private val list:List<User>) : ArrayAdapter<User>(context,R.layout.custom_list_item,list) {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val rootView = context.layoutInflater.inflate(R.layout.custom_list_item,null,true)
        val txt_name = rootView.findViewById<TextView>(R.id.txt_name)
        val txt_mail = rootView.findViewById<TextView>(R.id.txt_mail)
        val txt_age = rootView.findViewById<TextView>(R.id.txt_age)
        val img_user = rootView.findViewById<ImageView>(R.id.img_user)

        val user = list.get(position)

        txt_name.text =" ${user.first} ${user.last}"
        txt_mail.text = user.email
        txt_age.text = user.age.toString()

        //caching
        Glide.with(rootView).load(user.image).into(img_user)


        return rootView
    }


}
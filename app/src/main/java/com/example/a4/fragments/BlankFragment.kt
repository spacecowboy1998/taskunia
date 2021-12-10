package com.example.a4.fragments

import android.os.Bundle
import android.provider.ContactsContract
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.a4.R
import com.example.a4.sendif

class BlankFragment : Fragment(R.layout.fragment_blank) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_blank, container, false)



        var firstname = view.findViewById<EditText>(R.id.name)
        var lastname = view.findViewById<EditText>(R.id.last)
        var email = view.findViewById<EditText>(R.id.email)


        view.findViewById<Button>(R.id.next1).setOnClickListener{

            var firstnamebt = firstname.text.toString()
            var lastnamebt = lastname.text.toString()
            var emailbt = email.text.toString()

            var data = sendif(firstnamebt,lastnamebt,emailbt)

            val action = BlankFragmentDirections.actionBlankFragmentToBlankFragment2(data)
            findNavController().navigate(action)
        }



        return view
    }







}
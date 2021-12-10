package com.example.a4.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.a4.R
import com.example.a4.sendif


class BlankFragment3 : Fragment(R.layout.fragment_blank3) {

    private val args by navArgs<BlankFragment3Args>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view =  inflater.inflate(R.layout.fragment_blank3, container, false)


        val jOb = view.findViewById<EditText>(R.id.job)
        val education = view.findViewById<EditText>(R.id.education)
        val exp = view.findViewById<EditText>(R.id.exp)


        view.findViewById<Button>(R.id.next3).setOnClickListener{


            var jObbt = jOb.text.toString()
            var educationbt = education.text.toString()
            var expbt = exp.text.toString()


            val job = sendif( jObbt , educationbt , expbt )
            val action = BlankFragment3Directions.actionBlankFragment3ToBlankFragment4(args.data,args.location,job)
            findNavController().navigate(action)
        }


        return view
    }



}
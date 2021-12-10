package com.example.a4.fragments

import android.os.Bundle
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
import androidx.navigation.fragment.navArgs
import com.example.a4.R
import com.example.a4.sendif


class BlankFragment2 : Fragment(R.layout.fragment_blank2) {

    private val args by navArgs<BlankFragment2Args>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view =  inflater.inflate(R.layout.fragment_blank2, container, false)



        var country = view.findViewById<EditText>(R.id.country)
        var adress = view.findViewById<EditText>(R.id.adress)
        var zip = view.findViewById<EditText>(R.id.zip)




        view.findViewById<Button>(R.id.next2).setOnClickListener{

            var countrybt = country.text.toString()
            var adressbt = adress.text.toString()
            var zipbt = zip.text.toString()

            val location = sendif(countrybt, adressbt,zipbt)

            val action = BlankFragment2Directions.actionBlankFragment2ToBlankFragment3(args.data,location)
            findNavController().navigate(action)
        }


        return view
    }





}
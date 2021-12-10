package com.example.a4.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.fragment.navArgs
import com.example.a4.R




class BlankFragment4 : Fragment(R.layout.fragment_blank4) {

    private val args by navArgs<BlankFragment4Args>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_blank4, container, false)



        view.findViewById<TextView>(R.id.NAME).text = args.data.first
        view.findViewById<TextView>(R.id.LAST).text = args.data.second
        view.findViewById<TextView>(R.id.EMAIL).text = args.data.third
        view.findViewById<TextView>(R.id.COUNTRY).text = args.location.first
        view.findViewById<TextView>(R.id.ADRESS).text = args.location.second
        view.findViewById<TextView>(R.id.ZIP).text = args.location.third
        view.findViewById<TextView>(R.id.JOB).text = args.job.first
        view.findViewById<TextView>(R.id.EDUCATION).text = args.job.second
        view.findViewById<TextView>(R.id.EXP).text = args.job.third

        view.findViewById<Button>(R.id.send).setOnClickListener{
            if( view.findViewById<TextView>(R.id.NAME).text.toString() == "" ||
                view.findViewById<TextView>(R.id.LAST).text.toString() == "" ||
                view.findViewById<TextView>(R.id.EMAIL).text.toString() == "" ||
                view.findViewById<TextView>(R.id.COUNTRY).text.toString() == "" ||
                view.findViewById<TextView>(R.id.ADRESS).text.toString() == "" ||
                view.findViewById<TextView>(R.id.ZIP).text.toString() == "" ||
                view.findViewById<TextView>(R.id.JOB).text.toString() == "" ||
                view.findViewById<TextView>(R.id.EDUCATION).text.toString() == "" ||
                view.findViewById<TextView>(R.id.EXP).text.toString() == ""
           ) {
                Toast.makeText(requireActivity(), "მონაცემები არასრულადაა შევსებული", Toast.LENGTH_LONG).show()
           }else{
                Toast.makeText(requireActivity(), "თქვენი მონაცემები წარმატებით გაიგზავნა", Toast.LENGTH_LONG).show()
            }

      }


        return view
    }


}
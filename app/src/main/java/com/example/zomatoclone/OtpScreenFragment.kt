package com.example.zomatoclone

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.cardview.widget.CardView

class OtpScreenFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_otp_screen, container, false)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lateinit var edit1: EditText
        lateinit var edit2: EditText
        lateinit var edit3: EditText
        lateinit var edit4: EditText
        lateinit var edit5: EditText
        lateinit var edit6: EditText
        lateinit var submit:CardView

        edit1 = view.findViewById(R.id.box1)
        edit2 = view.findViewById(R.id.box2)
        edit3 = view.findViewById(R.id.box3)
        edit4 = view.findViewById(R.id.box4)
        edit5 = view.findViewById(R.id.box5)
        edit6 = view.findViewById(R.id.box6)

            edit1.background = resources.getDrawable(R.drawable.editbg)

        edit1.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, p1: Int, p2: Int, p3: Int) {
                edit1.requestFocus()
                /*edit1.setBackground(R.drawable.editbg)*/


                Log.d("harsh==", "beforeTextChanged: ")
            }

            override fun onTextChanged(s: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (edit1.text.length ==1) {
                    edit2.requestFocus()
                    edit2.background = resources.getDrawable(R.drawable.editbg)
                }
                Log.d("harsh==", "onTextChanged: ")


            }

            override fun afterTextChanged(s: Editable?) {
               edit1.background=null

            }

        })




        edit2.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(s: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (edit2.text.length ==1) {
                    edit3.requestFocus()
                    edit3.background = resources.getDrawable(R.drawable.editbg)

                }
            }

            override fun afterTextChanged(s: Editable?) {
                if (edit2.text.length == 0) {
                    edit1.requestFocus()
                    edit1.background=resources.getDrawable(R.drawable.editbg)

                }
                edit2.background=null
            }
        })

        edit3.addTextChangedListener(object:TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(s: CharSequence?, p1: Int, p2: Int, p3: Int) {

                if(edit3.text.length==1)
                {
                    edit4.requestFocus()
                    edit4.background=resources.getDrawable(R.drawable.editbg)
                }

            }

            override fun afterTextChanged(s: Editable?) {
                if(edit3.text.length==0)
                {
                    edit2.requestFocus()
                    edit2.background=resources.getDrawable(R.drawable.editbg)


                }
                edit3.background=null
            }

        })

        edit4.addTextChangedListener(object:TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(s: CharSequence?, p1: Int, p2: Int, p3: Int) {

                if(edit4.text.length==1)
                {
                    edit5.requestFocus()
                    edit5.background=resources.getDrawable(R.drawable.editbg)
                }

            }

            override fun afterTextChanged(s: Editable?) {
                if(edit4.text.length==0)
                {
                    edit3.requestFocus()
                    edit3.background=resources.getDrawable(R.drawable.editbg)
                }
                edit4.background=null

            }

        })
        edit5.addTextChangedListener(object:TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(s: CharSequence?, p1: Int, p2: Int, p3: Int) {

                if(edit5.text.length==1)
                {
                    edit6.requestFocus()
                    edit6.background=resources.getDrawable(R.drawable.editbg)
                }

            }

            override fun afterTextChanged(s: Editable?) {
                edit5.background=null
                if(edit5.text.length==0)
                {
                    edit4.requestFocus()
                    edit4.background=resources.getDrawable(R.drawable.editbg)
                }
            }

        })

        edit6.addTextChangedListener(object:TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(s: CharSequence?, p1: Int, p2: Int, p3: Int) {


            }

            override fun afterTextChanged(s: Editable?) {

                if(edit6.text.length==0)
                {
                    edit6.background=null
                    edit5.requestFocus()
                   edit5.background=resources.getDrawable(R.drawable.editbg)
                }

            }

        })
        submit=view.findViewById(R.id.submit)
        submit.setOnClickListener{
            val intent= Intent(requireContext(),ZomatoHomeScreen::class.java)
            startActivity(intent)
        }


    }


}
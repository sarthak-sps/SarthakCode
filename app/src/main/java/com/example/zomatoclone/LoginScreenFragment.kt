package com.example.zomatoclone

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.navigation.fragment.NavHostFragment

class LoginScreenFragment : Fragment() {
  lateinit var phone_number:EditText
  lateinit var next:CardView
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
        val view= inflater.inflate(R.layout.fragment_login_screen, container, false)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController= NavHostFragment.findNavController(this)
        phone_number=view.findViewById(R.id.phone_number)
        phone_number.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun afterTextChanged(s: Editable?) {
                val phoneNumber=s.toString()
                if(isValid(phoneNumber))
                if(isValid(phoneNumber) && phone_number.text.length==10){
                    Toast.makeText(context,"valid Number",Toast.LENGTH_SHORT).show()
                }
            }
        })
        next=view.findViewById(R.id.next)
        next.setOnClickListener{
            phone_number=view.findViewById(R.id.phone_number)
            val check=phone_number.text.toString()
            if(isValid(check))
            {
                navController.navigate(R.id.action_loginScreenFragment_to_otpScreenFragment)
            }

        }
    }
   private fun isValid(phoneNumber:String):Boolean{
       val regex=Regex("^[0-9]{10}\$")
       return regex.matches(phoneNumber)
   }

}
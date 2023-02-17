package com.example.thenavigration

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.thenavigration.databinding.FragmentTwoBinding


class FragmentTwo : Fragment() {

    private lateinit var binding: FragmentTwoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_two, container, false)
        binding.Btntwo.setOnClickListener {
          /*  Toast.makeText(context, "check two", Toast.LENGTH_SHORT).show()*/
            it.findNavController().navigate(R.id.action_fragmentTwo_to_fragmentThree)
        }

        var name = arguments?.getString("name")
        binding.fragmentsetdatatext.setText(name)

        Log.e("NAME", "onCreateView: "+name )

        return binding.root
    }

}
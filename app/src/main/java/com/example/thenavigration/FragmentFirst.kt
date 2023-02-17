package com.example.thenavigration

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.thenavigration.databinding.FragmentFirstBinding


class FragmentFirst : Fragment() {

    private lateinit var binding: FragmentFirstBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentFirstBinding.inflate(inflater, container, false)
        binding.fragmentoneBtn.setOnClickListener {

            var name = binding.editBtn.text.toString().trim()
            var bundle  = Bundle()
            bundle.putString("name",name)

            Toast.makeText(context, "check", Toast.LENGTH_SHORT).show()
            it.findNavController().navigate(R.id.action_fragmentFirst_to_fragmentTwo,bundle)

        }
        return binding.root
    }
}
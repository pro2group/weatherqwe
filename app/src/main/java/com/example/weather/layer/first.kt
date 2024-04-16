package com.example.weather.layer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.lifecycle.ViewModelProvider
import com.example.weather.R
import com.example.weather.databinding.FragmentFirstBinding

class first : Fragment() {
    private lateinit var binding: FragmentFirstBinding
    private lateinit var pLauncher: ActivityResultLauncher<String>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
    private fun permissionListener()
    {
        var pLauncher = registerForActivityResult(
            ActivityResultContracts.RequestPermission()
        )  { Toast.makeText(activity, "Permission is $it", Toast.LENGTH_LONG) }
    }
    private fun checkPermission() {
        if(isPermissionGranted(MainFirst.Permission.Acses_fine_location))
            permissionListener()
        pLauncher.launch(MainFirst.Permission.Acses_fine_location)
    }
    companion object{
        @JvmStatic
        fun newInstance() = first()
    }
}
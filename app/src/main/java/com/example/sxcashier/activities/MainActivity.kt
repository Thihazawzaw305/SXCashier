package com.example.sxcashier.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sxcashier.R
import com.example.sxcashier.adapters.SectionRecyclerViewAdapter
import com.example.sxcashier.adapters.TableRecyclerView
import com.example.sxcashier.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var mSectionRecyclerViewAdapter: SectionRecyclerViewAdapter
    private lateinit var mTableRecyclerViewAdapter: TableRecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setUpRecyclerView()
    }


    private fun setUpRecyclerView() {
        mSectionRecyclerViewAdapter = SectionRecyclerViewAdapter()
        binding.rvSection?.adapter = mSectionRecyclerViewAdapter
        binding.rvSection?.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        mTableRecyclerViewAdapter = TableRecyclerView()
        binding.rvTable?.adapter = mTableRecyclerViewAdapter
        binding.rvTable?.layoutManager = GridLayoutManager(this, 3)


    }

}
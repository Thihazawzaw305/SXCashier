package com.example.sxcashier.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sxcashier.databinding.ViewHolderSectionBinding
import com.example.sxcashier.viewholders.SectionItemViewHolder

class SectionRecyclerViewAdapter():RecyclerView.Adapter<SectionItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SectionItemViewHolder {
      val binding = ViewHolderSectionBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return SectionItemViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return 5
    }

    override fun onBindViewHolder(holder: SectionItemViewHolder, position: Int) {
    }
}
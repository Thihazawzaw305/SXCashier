package com.example.sxcashier.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sxcashier.databinding.ViewHolderSectionBinding
import com.example.sxcashier.databinding.ViewHolderTableBinding
import com.example.sxcashier.viewholders.SectionItemViewHolder
import com.example.sxcashier.viewholders.TableViewHolder

class TableRecyclerView : RecyclerView.Adapter<TableViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TableViewHolder {
        val binding = ViewHolderTableBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return TableViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return 20
    }

    override fun onBindViewHolder(holder: TableViewHolder, position: Int) {
    }
}
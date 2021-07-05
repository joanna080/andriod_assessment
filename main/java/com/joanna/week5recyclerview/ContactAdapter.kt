package com.joanna.week5recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.joanna.week5recyclerview.databinding.ContactItemBinding

class ContactAdapter (val contacts: List<ContactModel>):
    RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {

    class ContactViewHolder(val binding: ContactItemBinding):
        RecyclerView.ViewHolder(binding.root){

        fun bind(profile: ContactModel){
            binding.firstName.text = profile.firstName
            binding.lastName.text = profile.lastName
            binding.imageView.setImageResource(profile.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding:ContactItemBinding = ContactItemBinding.inflate(LayoutInflater.from(parent.context))
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val profile = contacts.get(position)
        holder.bind(profile)
    }

    override fun getItemCount(): Int {
        return contacts.size
    }
    }
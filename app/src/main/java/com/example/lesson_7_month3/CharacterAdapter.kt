package com.example.lesson_7_month3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.bumptech.glide.Glide
import com.example.lesson_7_month3.databinding.ItemCharacterBinding

class CharacterAdapter(
    val list: ArrayList<CharacterModel>,
    val onClick:(position: Int) ->Unit
):Adapter<CharacterAdapter.ViewHolder>() {

  inner class ViewHolder(private val binding: ItemCharacterBinding): RecyclerView.ViewHolder(binding.root){

      fun bind(){
        val characterModel =list[adapterPosition]
            binding.tvName.text = characterModel.name
            binding.tvStatus.text = characterModel.status
            Glide.with(binding.imgPhoto).load(characterModel.photo).into(binding.imgPhoto)

          binding.cardView.setOnClickListener {
            onClick(adapterPosition)
          }
      }
  }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemCharacterBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int =list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind()
    }
}
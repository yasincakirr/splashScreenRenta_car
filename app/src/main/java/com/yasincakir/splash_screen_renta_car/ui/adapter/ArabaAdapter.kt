package com.yasincakir.splash_screen_renta_car.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.yasincakir.splash_screen_renta_car.data.entity.Arabalar
import com.yasincakir.splash_screen_renta_car.databinding.CardTasarimBinding
import com.yasincakir.splash_screen_renta_car.databinding.FragmentArabaListesiBinding
import com.yasincakir.splash_screen_renta_car.ui.fragment.ArabaListesiFragment
import com.yasincakir.splash_screen_renta_car.ui.fragment.ArabaListesiFragmentDirections

class ArabaAdapter(var mContext: Context, var arabaListesi:List<Arabalar>)
    :RecyclerView.Adapter<ArabaAdapter.CardTasarimTutucu>() {


    inner class CardTasarimTutucu(var tasarim:CardTasarimBinding):RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
       val binding = CardTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardTasarimTutucu(binding)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val araba = arabaListesi.get(position)
        val t = holder.tasarim

        t.textViewFiyat.text = "${araba.fiyat}"

        t.imageViewResim.setImageResource(mContext.resources.getIdentifier(araba.resim,"drawable",mContext.packageName))


        t.buttonDetay.setOnClickListener {

            val gecis = ArabaListesiFragmentDirections.arabaDetayGecis(araba=araba)
            Navigation.findNavController(it).navigate(gecis)

        }

    }

    override fun getItemCount(): Int {

        return arabaListesi.size
    }


}
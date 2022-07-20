package binar.greta.challenge3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_screen_empat.*


class ScreenEmpatFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_screen_empat, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
         val nama = arguments?.getString("NAMA")

        btn_screenempat.setOnClickListener {
            val usia = edt_usia.text.toString().toInt()
            val alamat = edt_alamat.text.toString()
            val pekerjaan = edt_pekerjaan.text.toString()

            val dataChallenge = DataChallenge(usia, alamat, pekerjaan)

            val keterangan = if(usia % 2 == 0 ){
                "Genap"
            }else{
                "Ganjil"
            }

            val dataSemuaDua = bundleOf( "DATA_CHALLENGE" to dataChallenge, "NAMA" to nama, "KETERANGAN" to keterangan)
            Navigation.findNavController(view).navigate(R.id.back_ScreenTigaFragment, dataSemuaDua)
        }
    }


}
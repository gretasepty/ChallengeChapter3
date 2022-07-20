package binar.greta.challenge3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_screen_tiga.*


class ScreenTigaFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_screen_tiga, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val nama = arguments?.getString("NAMA")
        txt_nama.text = nama

//        val dataUsia = arguments?.getInt("USIA")
//        val dataKeterangan = arguments?.getString("KETERANGAN")
//        val dataAlamat = arguments?.getString("ALAMAT")
//        val dataPekerjaan = arguments?.getString("PEKERJAAN")

        val getData = arguments?.getParcelable("DATA_CHALLENGE") as DataChallenge?
        val dataKeterangan = arguments?.getString("KETERANGAN")

        //Tampilan Fragment Tiga Setelah Menginputkan Data di Fragment Empat
//        txt_nama.text = getData?.nama
        txt_usia.text = getData?.usia.toString()
        txt_usia.append(", bernilai $dataKeterangan")
        txt_alamat.text = getData?.alamat
        txt_pekerjaan.text = getData?.pekerjaan



//        txt_nama.append("Nama : $dataNama")
//        txt_usia.append("Usia : $dataUsia, bernilai $dataKeterangan")
//        txt_alamat.append("Alamat : $dataAlamat")
//        txt_pekerjaan.append("Pekerjaan : $dataPekerjaan")

        btn_screentiga.setOnClickListener {
            val dataNama = bundleOf("NAMA" to nama)
            Navigation.findNavController(view).navigate(R.id.ke_ScreenEmpatFragment, dataNama)
        }

    }


}
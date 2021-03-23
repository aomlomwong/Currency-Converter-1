package th.ac.su.ict.currencyconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    lateinit var edtUSD: EditText
    lateinit var tvRate:TextView
    lateinit var tvUSD: TextView
    lateinit var tvTHB: TextView

    var BASE_URL = "https://api.exchangeratesapi.io/"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtUSD = findViewById<EditText>(R.id.edtUSD)
        tvRate = findViewById<EditText>(R.id.tvRate)
        tvTHB = findViewById<EditText>(R.id.tvTHB)

        val btnOK = findViewById<Button>(R.id.btnOK)

        btnOK.setOnClickListener {
            getCurrentRate()
        }

    }

    fun getCurrentRate(){
        var retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}




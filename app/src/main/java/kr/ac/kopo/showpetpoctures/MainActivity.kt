package kr.ac.kopo.showpetpoctures

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {
    lateinit var checkStart:CheckBox
    lateinit var rg:RadioGroup
    lateinit var linearSub:LinearLayout
    lateinit var btnDone:Button
    lateinit var imgV:ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkStart =findViewById(R.id.checkStart)
        rg=findViewById(R.id.rg)
        linearSub=findViewById<LinearLayout>(R.id.rg)
        btnDone=findViewById<Button>(R.id.btnDone)
        imgV=findViewById<ImageView>(R.id.imgV)

        linearSub.visibility=View.INVISIBLE

        checkStart.setOnCheckedChangeListener(){buttonView,isChecked ->
            if(isChecked){
                linearSub.visibility = View.VISIBLE
            }else{
                linearSub.visibility=View.INVISIBLE

            }
        }

        btnDone.setOnClickListener{
            when(rg.checkedRadioButtonId){
                R.id.radiopuppy ->imgV.setImageResource(R.drawable.puppy)
                R.id.radiokitty1 ->imgV.setImageResource(R.drawable.kitty1)
                R.id.radiobunny ->imgV.setImageResource(R.drawable.bunny)
            }
        }
    }
}
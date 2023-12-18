package com.example.ez031

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tt01: TextView = findViewById(R.id.tt01)
        val tt02: TextView = findViewById(R.id.tt02)
        val s1: EditText = findViewById(R.id.s1)
        val s2: EditText = findViewById(R.id.s2)
        val s3: EditText = findViewById(R.id.s3)
        val s4: EditText = findViewById(R.id.s4)
        val s5: EditText = findViewById(R.id.s5)
        val c1: EditText = findViewById(R.id.c1)
        val c2: EditText = findViewById(R.id.c2)
        val c3: EditText = findViewById(R.id.c3)
        val c4: EditText = findViewById(R.id.c4)
        val c5: EditText = findViewById(R.id.c5)
        val p1: EditText = findViewById(R.id.p1)
        val p2: EditText = findViewById(R.id.p2)
        val p3: EditText = findViewById(R.id.p3)
        val p4: EditText = findViewById(R.id.p4)
        val p5: EditText = findViewById(R.id.p5)
        val ok: Button = findViewById(R.id.ok)
        val clear: Button = findViewById(R.id.clear)



        ok.setOnClickListener{
            var sub1 = s1.text.toString()
            var cre1 = c1.text.toString()
            var poi1 = p1.text.toString()

            var sub2 = s2.text.toString()
            var cre2 = c2.text.toString()
            var poi2 = p2.text.toString()

            var sub3 = s3.text.toString()
            var cre3 = c3.text.toString()
            var poi3 = p3.text.toString()

            var sub4 = s4.text.toString()
            var cre4 = c4.text.toString()
            var poi4 = p4.text.toString()

            var sub5 = s5.text.toString()
            var cre5 = c5.text.toString()
            var poi5 = p5.text.toString()

            if (sub1 == "" || cre1 == ""|| poi1 == ""|| sub2 == "" || cre2 == ""|| poi2 == ""|| sub3 == "" || cre3 == ""|| poi3 == ""
                || sub4 == "" || cre4 == ""|| poi4 == ""|| sub5 == "" || cre5 == ""|| poi5 == "") {
                toast {
                    "Please Input All Text Box Before Press OK !!!"
                }
            } else if (cre1.toInt() > 3 || cre2.toInt() > 3 || cre3.toInt() > 3 || cre4.toInt() >3 || cre5.toInt() > 3){
                toast {
                    "Please Input Credit < 3 !!!"
                }
            } else{
                var sumcredit = cre1.toInt() + cre2.toInt() + cre3.toInt() + cre4.toInt() + cre5.toInt()
                tt01.setText(sumcredit.toString())
                var cxd1 = cre1.toDouble() * poi1.toDouble()
                var cxd2 = cre2.toDouble() * poi2.toDouble()
                var cxd3 = cre3.toDouble() * poi3.toDouble()
                var cxd4 = cre4.toDouble() * poi4.toDouble()
                var cxd5 = cre5.toDouble() * poi5.toDouble()
                var sumcxd = cxd1 + cxd2 + cxd3 + cxd4 + cxd5
                var grade = sumcxd.toString().toDouble() / sumcredit.toString().toDouble()
                val ss = String.format("%.2f",grade)
                tt02.setText(ss)


            }
        }
        clear.setOnClickListener {
            s1.setText("")
            c1.setText("")
            p1.setText("")

            s2.setText("")
            c2.setText("")
            p2.setText("")

            s3.setText("")
            c3.setText("")
            p3.setText("")

            s4.setText("")
            c4.setText("")
            p4.setText("")

            s5.setText("")
            c5.setText("")
            p5.setText("")
        }

    }
}
inline fun Context.toast(message:()->String) {
    Toast.makeText(this, message(), Toast.LENGTH_LONG).show()
}

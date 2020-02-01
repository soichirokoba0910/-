パッケージ com.example.activity

import  android.os.Bundle
import  android.widget.Button
import  android.widget.EditText
import  android.widget.TextView
import  androidx.appcompat.app.AppCompatActivity
import  com.test.rensyuudai.R

クラス rennsyuudai1 ：AppCompatActivity（）{

    オーバーライド 楽しい のonCreate（savedInstanceState ： ？バンドル）{
        super .onCreate（savedInstanceState）

        setContentView（R .layout.activity_main）

        val editText1 = findViewById < EditText >（R .id.editText）
        val editText2 = findViewById < EditText >（R .id.editText2）
        val textView = findViewById < TextView >（R .id.textView）
        val button1 = findViewById < Button >（R .id.button）
        val button2 = findViewById < Button >（R .id.button2）

        button1.setOnClickListener {
            textView.text =（editText1.text.toString（）。toInt（）+
                    editText2.text.toString（）。toInt（））。toString（）
        }
        button2.setOnClickListener {
            textView.text =（editText1.text.toString（）。toInt（）-
                    editText2.text.toString（）。toInt（））。toString（）
        }
        }
}

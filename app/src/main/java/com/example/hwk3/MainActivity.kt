package com.example.hwk3

import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import android.view.Gravity
//import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import bluenet.com.hwk3.f1
import bluenet.com.hwk3.f2
import bluenet.com.hwk3.f3
import com.example.hwk3.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
        const val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //初始化頁面
        Log.e(TAG, "onCreate")
        //連結畫面
        setContentView(R.layout.activity_main)
        //連接Adapter，讓畫面(Fragment)與ViewPager建立關聯
        viewPager.adapter = ViewPagerAdapter(supportFragmentManager)
    }
/*
        val btn : Button = findViewById(R.id.button)
        btn.setOnClickListener(View.OnClickListener {
            val dialog = AlertDialog.Builder(this@MainActivity)
            dialog.setTitle("請選擇功能")
            dialog.setMessage("請根據下方按鈕選擇要顯示的物件")

            dialog.setNeutralButton("取消") { dialogInterface, i -> Toast.makeText(this@MainActivity, "dialog開關", Toast.LENGTH_SHORT).show() }
            dialog.setNegativeButton("自定義Toast") { dialogInterface, i -> showToast() }
            dialog.setPositiveButton("顯示list") { dialogInterface, i -> showListDialog() }
            dialog.show()
        })
    }

    private fun showToast() {
        val toast = Toast(this@MainActivity)
        toast.setGravity(Gravity.TOP, 0, 50)
        toast.duration = Toast.LENGTH_SHORT
        val inflater = layoutInflater
        val layout = inflater.inflate(R.layout.custom_toast,
            findViewById(R.id.custom_toast_root) )
        toast.view = layout
        toast.show()
    }

    private fun showListDialog() {
        val list = arrayOf("message1", "message2", "message3", "message4", "message5")
        val dialog_list = AlertDialog.Builder(this@MainActivity)
        dialog_list.setTitle("使用LIST呈現")
        dialog_list.setItems(list) { dialogInterface, i ->
            Toast.makeText(this@MainActivity,
                "你選得是" + list[i], Toast.LENGTH_SHORT).show()
        }
        dialog_list.show()
    }
*/
    override fun onRestart() {
        super.onRestart()
        //返回頁面
        Log.e(TAG,"onRestart")
    }

    override fun onStart() {
        super.onStart()
        //頁面可見
        Log.e(TAG,"onStart")
    }

    override fun onResume() {
        super.onResume()
        //頁面與使用者開始互動
        Log.e(TAG,"onResume")
    }

    override fun onPause() {
        super.onPause()
        //離開頁面
        Log.e(TAG,"onPause")
    }

    override fun onStop() {
        super.onStop()
        //頁面不可見
        Log.e(TAG,"onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        //回收頁面
        Log.e(TAG,"onDestroy")
    }
}
/*
class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn : Button = findViewById(R.id.button)
        btn.setOnClickListener(View.OnClickListener {
            val dialog = AlertDialog.Builder(this@MainActivity)
            dialog.setTitle("請選擇功能")
            dialog.setMessage("請根據下方按鈕選擇要顯示的物件")

            dialog.setNeutralButton("取消") { dialogInterface, i -> Toast.makeText(this@MainActivity, "dialog開關", Toast.LENGTH_SHORT).show() }
            dialog.setNegativeButton("自定義Toast") { dialogInterface, i -> showToast() }
            dialog.setPositiveButton("顯示list") { dialogInterface, i -> showListDialog() }
            dialog.show()
        })
    }

    private fun showToast() {
        val toast = Toast(this@MainActivity)
        toast.setGravity(Gravity.TOP, 0, 50)
        toast.duration = Toast.LENGTH_SHORT
        val inflater = layoutInflater
        val layout = inflater.inflate(R.layout.custom_toast,
                findViewById(R.id.custom_toast_root) )
        toast.view = layout
        toast.show()
    }

    private fun showListDialog() {
        val list = arrayOf("message1", "message2", "message3", "message4", "message5")
        val dialog_list = AlertDialog.Builder(this@MainActivity)
        dialog_list.setTitle("使用LIST呈現")
        dialog_list.setItems(list) { dialogInterface, i ->
            Toast.makeText(this@MainActivity,
                    "你選得是" + list[i], Toast.LENGTH_SHORT).show()
        }
        dialog_list.show()
    }
}
*/
class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    //回傳對應位置的Fragment，決定頁面的呈現順序
    override fun getItem(position: Int) = when(position){
        0 -> f1()    //第一頁要呈現的Fragment
        1 -> f2()   //第二頁要呈現的Fragment
        else -> f3() //第三頁要呈現的Fragment
    }
    //回傳Fragment頁數
    override fun getCount() = 3
}
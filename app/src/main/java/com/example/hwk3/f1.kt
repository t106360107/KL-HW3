package bluenet.com.hwk3

import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.example.hwk3.R

class f1 : Fragment() {
    companion object {
        const val TAG = "f1"
    }
/*
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //初始化頁面
        Log.e(TAG,"onCreate")
    }*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //view!!.setContentView(R.layout.fragment_f1)
        Log.e(TAG,"onCreate")

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        //連結畫面
        Log.e(TAG,"onCreateView")
        //return inflater.inflate(R.layout.fragment_f1, container, false)
        val view = inflater.inflate(R.layout.fragment_f1, container, false);
        val btn : Button = view.findViewById(R.id.button)
        btn.setOnClickListener(View.OnClickListener {
            val dialog = AlertDialog.Builder(this.context!!)
            dialog.setTitle("請選擇功能")
            dialog.setMessage("請根據下方按鈕選擇要顯示的物件")

            dialog.setNeutralButton("取消") { dialogInterface, i -> Toast.makeText(this.context!!, "dialog開關", Toast.LENGTH_SHORT).show() }
            dialog.setNegativeButton("自定義Toast") { dialogInterface, i -> showToast() }
            dialog.setPositiveButton("顯示list") { dialogInterface, i -> showListDialog() }
            dialog.show()
        })
        return view;
    }

    private fun showToast() {
        val toast = Toast(this.context!!)
        toast.setGravity(Gravity.TOP, 0, 50)
        toast.duration = Toast.LENGTH_SHORT
        val inflater = layoutInflater
        val layout = inflater.inflate(R.layout.custom_toast,
            view!!.findViewById(R.id.custom_toast_root) )
        toast.view = layout
        toast.show()
    }

    private fun showListDialog() {
        val list = arrayOf("message1", "message2", "message3", "message4", "message5")
        val dialog_list = AlertDialog.Builder(this.context!!)
        dialog_list.setTitle("使用LIST呈現")
        dialog_list.setItems(list) { dialogInterface, i ->
            Toast.makeText(this.context!!,
                "你選得是" + list[i], Toast.LENGTH_SHORT).show()
        }
        dialog_list.show()
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        //連結Fragment與Activity
        Log.e(TAG,"onActivityCreated")
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

    override fun onDestroyView() {
        super.onDestroyView()
        //移除畫面
        Log.e(TAG,"onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        //回收頁面
        Log.e(TAG,"onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        //移除Fragment
        Log.e(TAG,"onDetach")
    }
}
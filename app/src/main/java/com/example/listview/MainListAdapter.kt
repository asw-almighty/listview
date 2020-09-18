package com.example.listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.listview_item.view.*

class MainListAdapter(val context: Context, val list_sample : ArrayList<String>) : BaseAdapter(){
    //A, B, C가 들어있는 list_sample

    /** Item부분의 view를 그려주는 부분*/
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        //view를 통해서 List item에 접근할 수 있다.(listview_item에 있는 view들에 접근)
        val view : View = LayoutInflater.from(context).inflate(R.layout.listview_item, null)

        view.list_sample_text1.setText(list_sample.get(p0))
        return view
    }

    /**각각의 Item을 return 해주는 부분 */
    override fun getItem(p0: Int): Any {
        return 0
    }

    /** Item Id를 return*/
    override fun getItemId(p0: Int): Long {
        return 0
    }

    /** Item의 count를 리턴*/
    override fun getCount(): Int {
        return list_sample.size
    }

}
package com.zaich.barchart

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.utils.ColorTemplate
import kotlinx.android.synthetic.main.activity_bar_chart_.*

class BarChartActivity : AppCompatActivity() {
    lateinit var barList:ArrayList<BarEntry>
    lateinit var barDataSet: BarDataSet
    lateinit var barData: BarData

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bar_chart_)
        barList= ArrayList()
        barList.add(BarEntry(1f,500f))
        barList.add(BarEntry(2f,400f))
        barList.add(BarEntry(3f,300f))
        barList.add(BarEntry(4f,200f))
        barList.add(BarEntry(5f,100f))
        barList.add(BarEntry(6f,200f))
        barList.add(BarEntry(7f,400f))

        barDataSet= BarDataSet(barList,"populations")
        barData= BarData(barDataSet)
        barchart.data = barData
        barDataSet.valueTextColor= Color.BLACK
        barDataSet.valueTextSize=15f

        barchart.animateY(1000)
    }
}
package com.example.hoo.justcalendar


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_month.*

private const val MONTH = "month"

class MonthFragment : Fragment() {

    private var month: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            month = it.getString(MONTH)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_month, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textView.text = month
    }


    companion object {
        @JvmStatic
        fun newInstance(month: String) =
            MonthFragment().apply {
                arguments = Bundle().apply {
                    putString(MONTH, month)
                }
            }
    }
}

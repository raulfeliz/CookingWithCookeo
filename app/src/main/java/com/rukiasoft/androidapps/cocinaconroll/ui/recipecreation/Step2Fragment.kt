package com.rukiasoft.androidapps.cocinaconroll.ui.recipecreation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rukiasoft.androidapps.cocinaconroll.R
import kotlinx.coroutines.ExperimentalCoroutinesApi


@ExperimentalCoroutinesApi
class Step2Fragment : ChildBaseFragment() {

    override val childPosition: NewRecipeParent.ChildPosition
        get() = NewRecipeParent.ChildPosition.SECOND


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_step2, container, false)


        return view
    }

    override fun validateFields(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

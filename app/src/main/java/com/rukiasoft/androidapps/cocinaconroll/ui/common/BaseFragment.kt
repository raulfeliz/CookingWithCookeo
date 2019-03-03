package com.rukiasoft.androidapps.cocinaconroll.ui.common


import com.rukiasoft.androidapps.cocinaconroll.databinding.CookeoBindingComponent
import com.rukiasoft.androidapps.cocinaconroll.preferences.PreferencesManager
import com.rukiasoft.androidapps.cocinaconroll.resources.ResourcesManager
import com.rukiasoft.androidapps.cocinaconroll.utils.GeneralUtils
import com.rukiasoft.androidapps.cocinaconroll.viewmodel.CocinaConRollViewModelFactory
import dagger.android.support.DaggerFragment
import javax.inject.Inject


open class BaseFragment : DaggerFragment() {

    @Inject
    protected lateinit var resourcesManager: ResourcesManager

    @Inject
    protected lateinit var preferenceManager: PreferencesManager

    @Inject
    protected lateinit var viewModelFactory: CocinaConRollViewModelFactory

    @Inject
    protected lateinit var generalUtils: GeneralUtils

    @Inject
    protected lateinit var cookeoBindingComponent: CookeoBindingComponent


}

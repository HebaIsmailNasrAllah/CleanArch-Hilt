package com.example.cleanarchitecture

import android.app.Application
import com.example.cleanarchitecture.di.AppContainer
import com.example.cleanarchitecture.presentation.viewmodels.MobileVMFactory
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MyApplication: Application()
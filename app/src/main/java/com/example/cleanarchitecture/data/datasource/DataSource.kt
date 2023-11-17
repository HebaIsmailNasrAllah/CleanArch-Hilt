package com.example.cleanarchitecture.data.datasource

import com.example.cleanarchitecture.data.models.DataModel
import javax.inject.Inject

class DataSource @Inject constructor() {

       fun getData(): List<DataModel> {
        return mutableListOf(
            DataModel('s'),
            DataModel('i'),
            DataModel('s'),
            DataModel('i'),
        )
    }
}
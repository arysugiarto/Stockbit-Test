package com.stockbit.hiring.ui.home

import com.stockbit.hiring.base.BaseAdapter
import com.stockbit.hiring.data.model.ExampleModel
import com.stockbit.hiring.data.model.ExamplesModel
import com.stockbit.hiring.databinding.ItemListBinding
import com.stockbit.hiring.util.textOrNull

object ExampleAdapter {
    val exampleAdapter =
        BaseAdapter.adapterOf<ExamplesModel.SponsoredData, ItemListBinding>(
            register = BaseAdapter.Register(
                onBindHolder = { _, item, view ->
                    view.run {
                        tvTitle.textOrNull = item.coinInfo.name
                        tvFullname.textOrNull = item.coinInfo.fullName
                        tvData.textOrNull = item.coinInfo.blockNumber.toString()
                        tvDataPercen.textOrNull = item.coinInfo.maxSupply.toString()

                    }
                }
            ),
            diff = BaseAdapter.Diff(
                areItemsTheSame = { old, new -> old.coinInfo.id == new.coinInfo.id},
                areContentsTheSame = { old, new -> old == new }
            )
        )

}
package com.bassamworks.tunify.adapters.cursorAdapters

import android.content.Context
import android.database.Cursor
import android.view.View
import android.widget.CursorAdapter
import android.widget.ResourceCursorAdapter
import com.bassamworks.tunify.R

class PlaylistsCursorAdapter(private val context: Context, cursor: Cursor) :
        ResourceCursorAdapter(context, R.layout.item_list_playlist, cursor, CursorAdapter.FLAG_REGISTER_CONTENT_OBSERVER) {

    override fun bindView(p0: View?, p1: Context?, p2: Cursor?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
package com.watchlistapp.comingsoon;

import android.app.Activity;
import android.content.Context;
import android.widget.ListView;

import com.watchlistapp.searchresults.SearchResultsItemAdapter;

/**
 * Created by VEINHORN on 11/12/13.
 */
public class ComingSoonItemAdapter extends SearchResultsItemAdapter {
    public ComingSoonItemAdapter(Context context, ComingSoonContainer comingSoonContainer, Activity activity, ListView listView) {
        super(context, comingSoonContainer, activity, listView);
    }
}

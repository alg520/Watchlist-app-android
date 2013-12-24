package com.watchlistapp.searchresults;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.watchlistapp.R;
import com.watchlistapp.themoviedb.SearchMovies;

/**
 * Created by VEINHORN on 02/12/13.
 */
public class SearchResultsActivity extends Activity {

    private TextView testTextView;
    private String queryString;
    private ListView searchResultsListView;
    private SearchResultsItemAdapter searchResultsItemAdapter;
    private SearchResultsContainer searchResultsContainer;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_results);
        queryString = getIntent().getStringExtra("query");

        searchResultsListView = (ListView)findViewById(R.id.search_results_listview);
        searchResultsContainer = new SearchResultsContainer();
        // Get the query that we sent from RecentActivity
        searchResultsItemAdapter = new SearchResultsItemAdapter(SearchResultsActivity.this, searchResultsContainer);
        searchResultsListView.setAdapter(searchResultsItemAdapter);

        SearchMovies searchMovies = new SearchMovies(SearchResultsActivity.this, queryString, searchResultsItemAdapter, searchResultsContainer);
        searchMovies.execute();
    }
}
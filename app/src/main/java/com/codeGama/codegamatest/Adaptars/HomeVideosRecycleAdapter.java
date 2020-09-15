package com.codeGama.codegamatest.Adaptars;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import com.codeGama.codegamatest.ModelClass.ClsVideosCategoryModel;
import com.codeGama.codegamatest.R;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

import java.util.List;

public class HomeVideosRecycleAdapter extends Adapter<HomeVideosRecycleAdapter.HomeVideosViewHolder> {
    Context context;
    private List<ClsVideosCategoryModel> videosList;
    private boolean rippleInClicked = false;

    public HomeVideosRecycleAdapter(Context context, List<ClsVideosCategoryModel> list) {
        this.videosList = list;
        this.context = context;

    }

    public HomeVideosViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        HomeVideosViewHolder holder=new HomeVideosViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_home_category_list, viewGroup, false));
        return holder;
    }

    public void onBindViewHolder(HomeVideosViewHolder homeVideosViewHolder, final int position) {
        ClsVideosCategoryModel clsVideosCategoryModel = this.videosList.get(position);
        homeVideosViewHolder.initVideoPLayer(videosList.get(position).getVideoID());

    }

    public int getItemCount() {
        return this.videosList.size();
    }
    public void play(YouTubePlayer Player,String videoID) {
        if(Player!=null)
        { Player.loadVideo(videoID, 0);
           Player.play();
        }
    }

    public class HomeVideosViewHolder extends ViewHolder {
        ImageView image;
        YouTubePlayer Player;
        YouTubePlayerView youTubePlayerView;
        public HomeVideosViewHolder(View view) {
            super(view);
             youTubePlayerView = view.findViewById(R.id.youtube_player_view);



        }
        public void initVideoPLayer(final String videoID){
            youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                @Override
                public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                    youTubePlayer.loadVideo(videoID, 0);
                    Player=youTubePlayer;
                    Player.pause();
                }
            });
        }
    }
}

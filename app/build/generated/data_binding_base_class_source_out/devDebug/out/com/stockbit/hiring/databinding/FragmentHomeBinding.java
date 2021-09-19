// Generated by view binder compiler. Do not edit!
package com.stockbit.hiring.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.textview.MaterialTextView;
import com.stockbit.hiring.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout constraintBar;

  @NonNull
  public final ImageView ivBack;

  @NonNull
  public final ImageView ivShare;

  @NonNull
  public final RecyclerView rvData;

  @NonNull
  public final MaterialTextView tvSymbol;

  @NonNull
  public final MaterialTextView tvTitle;

  @NonNull
  public final MaterialTextView tvWatchList;

  private FragmentHomeBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout constraintBar, @NonNull ImageView ivBack,
      @NonNull ImageView ivShare, @NonNull RecyclerView rvData, @NonNull MaterialTextView tvSymbol,
      @NonNull MaterialTextView tvTitle, @NonNull MaterialTextView tvWatchList) {
    this.rootView = rootView;
    this.constraintBar = constraintBar;
    this.ivBack = ivBack;
    this.ivShare = ivShare;
    this.rvData = rvData;
    this.tvSymbol = tvSymbol;
    this.tvTitle = tvTitle;
    this.tvWatchList = tvWatchList;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.constraintBar;
      ConstraintLayout constraintBar = rootView.findViewById(id);
      if (constraintBar == null) {
        break missingId;
      }

      id = R.id.ivBack;
      ImageView ivBack = rootView.findViewById(id);
      if (ivBack == null) {
        break missingId;
      }

      id = R.id.ivShare;
      ImageView ivShare = rootView.findViewById(id);
      if (ivShare == null) {
        break missingId;
      }

      id = R.id.rvData;
      RecyclerView rvData = rootView.findViewById(id);
      if (rvData == null) {
        break missingId;
      }

      id = R.id.tvSymbol;
      MaterialTextView tvSymbol = rootView.findViewById(id);
      if (tvSymbol == null) {
        break missingId;
      }

      id = R.id.tvTitle;
      MaterialTextView tvTitle = rootView.findViewById(id);
      if (tvTitle == null) {
        break missingId;
      }

      id = R.id.tvWatchList;
      MaterialTextView tvWatchList = rootView.findViewById(id);
      if (tvWatchList == null) {
        break missingId;
      }

      return new FragmentHomeBinding((ConstraintLayout) rootView, constraintBar, ivBack, ivShare,
          rvData, tvSymbol, tvTitle, tvWatchList);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

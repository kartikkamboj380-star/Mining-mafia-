package com.google.android.material.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class SearchBar$ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f39423h;

    public SearchBar$ScrollingViewBehavior() {
        this.f39423h = false;
    }

    private void U(AppBarLayout appBarLayout) {
        appBarLayout.setBackgroundColor(0);
        appBarLayout.setTargetElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // com.google.android.material.appbar.e
    protected boolean P() {
        return true;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        boolean zH = super.h(coordinatorLayout, view, view2);
        if (!this.f39423h && (view2 instanceof AppBarLayout)) {
            this.f39423h = true;
            U((AppBarLayout) view2);
        }
        return zH;
    }

    public SearchBar$ScrollingViewBehavior(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39423h = false;
    }
}

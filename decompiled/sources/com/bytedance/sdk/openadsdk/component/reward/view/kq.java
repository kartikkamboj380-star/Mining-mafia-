package com.bytedance.sdk.openadsdk.component.reward.view;

import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.n;
import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes.dex */
public class kq extends n {
    private RecyclerView bob;
    private i kq;
    private i oq;

    private i oq(RecyclerView.p pVar) {
        i iVar = this.oq;
        if (iVar == null || iVar.k() != pVar) {
            this.oq = i.a(pVar);
        }
        return this.oq;
    }

    @Override // androidx.recyclerview.widget.n
    public void attachToRecyclerView(RecyclerView recyclerView) {
        this.bob = recyclerView;
        super.attachToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.n
    @NonNull
    public int[] calculateDistanceToFinalSnap(@NonNull RecyclerView.p pVar, @NonNull View view) {
        int[] iArr = {0, 0};
        if (pVar.canScrollHorizontally()) {
            iArr[0] = kq(view, oq(pVar));
            return iArr;
        }
        if (pVar.canScrollVertically()) {
            iArr[1] = kq(view, kq(pVar));
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.n
    public RecyclerView.z createScroller(@NonNull RecyclerView.p pVar) {
        if (pVar instanceof RecyclerView.z.b) {
            return new g(this.bob.getContext()) { // from class: com.bytedance.sdk.openadsdk.component.reward.view.kq.1
                @Override // androidx.recyclerview.widget.g
                protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    return 100.0f / displayMetrics.densityDpi;
                }

                @Override // androidx.recyclerview.widget.g
                protected int calculateTimeForScrolling(int i10) {
                    return Math.min(100, super.calculateTimeForScrolling(i10));
                }

                @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.z
                protected void onTargetFound(View view, RecyclerView.A a10, RecyclerView.z.a aVar) {
                    kq kqVar = kq.this;
                    int[] iArrCalculateDistanceToFinalSnap = kqVar.calculateDistanceToFinalSnap(kqVar.bob.getLayoutManager(), view);
                    int i10 = iArrCalculateDistanceToFinalSnap[0];
                    int i11 = iArrCalculateDistanceToFinalSnap[1];
                    int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i10), Math.abs(i11)));
                    if (iCalculateTimeForDeceleration > 0) {
                        aVar.d(i10, i11, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
                    }
                }
            };
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.n
    public View findSnapView(@NonNull RecyclerView.p pVar) {
        int childCount = pVar.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) pVar;
        if (linearLayoutManager.findLastCompletelyVisibleItemPosition() == linearLayoutManager.getItemCount() - 1) {
            return null;
        }
        i iVarKq = kq(pVar);
        int i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = linearLayoutManager.getChildAt(i11);
            int iAbs = Math.abs(iVarKq.g(childAt));
            if (iAbs < i10) {
                view = childAt;
                i10 = iAbs;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.n
    public int findTargetSnapPosition(RecyclerView.p pVar, int i10, int i11) {
        View viewFindSnapView = findSnapView(pVar);
        int i12 = -1;
        if (viewFindSnapView == null) {
            return -1;
        }
        int position = pVar.getPosition(viewFindSnapView);
        if (pVar.canScrollVertically()) {
            i12 = i11 < 0 ? position - 1 : position + 1;
        }
        return Math.min(pVar.getItemCount() - 1, Math.max(i12, 0));
    }

    private int kq(View view, @NonNull i iVar) {
        int iG = iVar.g(view);
        return iG >= iVar.n() / 2 ? iG - iVar.n() : iG;
    }

    private i kq(RecyclerView.p pVar) {
        i iVar = this.kq;
        if (iVar == null || iVar.k() != pVar) {
            this.kq = i.c(pVar);
        }
        return this.kq;
    }
}

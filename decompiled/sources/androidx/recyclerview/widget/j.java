package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.gms.common.api.Api;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class j extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private i f10728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private i f10729b;

    class a extends g {
        a(Context context) {
            super(context);
        }

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
            j jVar = j.this;
            int[] iArrCalculateDistanceToFinalSnap = jVar.calculateDistanceToFinalSnap(jVar.mRecyclerView.getLayoutManager(), view);
            int i10 = iArrCalculateDistanceToFinalSnap[0];
            int i11 = iArrCalculateDistanceToFinalSnap[1];
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i10), Math.abs(i11)));
            if (iCalculateTimeForDeceleration > 0) {
                aVar.d(i10, i11, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    private int d(View view, i iVar) {
        return (iVar.g(view) + (iVar.e(view) / 2)) - (iVar.n() + (iVar.o() / 2));
    }

    private View e(RecyclerView.p pVar, i iVar) {
        int childCount = pVar.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int iN = iVar.n() + (iVar.o() / 2);
        int i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = pVar.getChildAt(i11);
            int iAbs = Math.abs((iVar.g(childAt) + (iVar.e(childAt) / 2)) - iN);
            if (iAbs < i10) {
                view = childAt;
                i10 = iAbs;
            }
        }
        return view;
    }

    private i f(RecyclerView.p pVar) {
        i iVar = this.f10729b;
        if (iVar == null || iVar.f10725a != pVar) {
            this.f10729b = i.a(pVar);
        }
        return this.f10729b;
    }

    private i g(RecyclerView.p pVar) {
        if (pVar.canScrollVertically()) {
            return h(pVar);
        }
        if (pVar.canScrollHorizontally()) {
            return f(pVar);
        }
        return null;
    }

    private i h(RecyclerView.p pVar) {
        i iVar = this.f10728a;
        if (iVar == null || iVar.f10725a != pVar) {
            this.f10728a = i.c(pVar);
        }
        return this.f10728a;
    }

    private boolean i(RecyclerView.p pVar, int i10, int i11) {
        if (pVar.canScrollHorizontally()) {
            return i10 > 0;
        }
        return i11 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean j(RecyclerView.p pVar) {
        PointF pointFComputeScrollVectorForPosition;
        int itemCount = pVar.getItemCount();
        if (!(pVar instanceof RecyclerView.z.b) || (pointFComputeScrollVectorForPosition = ((RecyclerView.z.b) pVar).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return false;
        }
        return pointFComputeScrollVectorForPosition.x < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || pointFComputeScrollVectorForPosition.y < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // androidx.recyclerview.widget.n
    public int[] calculateDistanceToFinalSnap(RecyclerView.p pVar, View view) {
        int[] iArr = new int[2];
        if (pVar.canScrollHorizontally()) {
            iArr[0] = d(view, f(pVar));
        } else {
            iArr[0] = 0;
        }
        if (pVar.canScrollVertically()) {
            iArr[1] = d(view, h(pVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.n
    protected RecyclerView.z createScroller(RecyclerView.p pVar) {
        if (pVar instanceof RecyclerView.z.b) {
            return new a(this.mRecyclerView.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.n
    public View findSnapView(RecyclerView.p pVar) {
        if (pVar.canScrollVertically()) {
            return e(pVar, h(pVar));
        }
        if (pVar.canScrollHorizontally()) {
            return e(pVar, f(pVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.n
    public int findTargetSnapPosition(RecyclerView.p pVar, int i10, int i11) {
        i iVarG;
        int itemCount = pVar.getItemCount();
        if (itemCount == 0 || (iVarG = g(pVar)) == null) {
            return -1;
        }
        int childCount = pVar.getChildCount();
        View view = null;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = pVar.getChildAt(i14);
            if (childAt != null) {
                int iD = d(childAt, iVarG);
                if (iD <= 0 && iD > i13) {
                    view2 = childAt;
                    i13 = iD;
                }
                if (iD >= 0 && iD < i12) {
                    view = childAt;
                    i12 = iD;
                }
            }
        }
        boolean zI = i(pVar, i10, i11);
        if (zI && view != null) {
            return pVar.getPosition(view);
        }
        if (!zI && view2 != null) {
            return pVar.getPosition(view2);
        }
        if (zI) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int position = pVar.getPosition(view) + (j(pVar) == zI ? -1 : 1);
        if (position < 0 || position >= itemCount) {
            return -1;
        }
        return position;
    }
}

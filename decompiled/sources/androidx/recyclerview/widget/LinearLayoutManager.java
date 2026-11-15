package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.p implements RecyclerView.z.b {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final a mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final b mLayoutChunkResult;
    private c mLayoutState;
    int mOrientation;
    i mOrientationHelper;
    d mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        i f10352a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f10353b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f10354c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f10355d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f10356e;

        a() {
            e();
        }

        void a() {
            this.f10354c = this.f10355d ? this.f10352a.i() : this.f10352a.n();
        }

        public void b(View view, int i10) {
            if (this.f10355d) {
                this.f10354c = this.f10352a.d(view) + this.f10352a.p();
            } else {
                this.f10354c = this.f10352a.g(view);
            }
            this.f10353b = i10;
        }

        public void c(View view, int i10) {
            int iP = this.f10352a.p();
            if (iP >= 0) {
                b(view, i10);
                return;
            }
            this.f10353b = i10;
            if (this.f10355d) {
                int i11 = (this.f10352a.i() - iP) - this.f10352a.d(view);
                this.f10354c = this.f10352a.i() - i11;
                if (i11 > 0) {
                    int iE = this.f10354c - this.f10352a.e(view);
                    int iN = this.f10352a.n();
                    int iMin = iE - (iN + Math.min(this.f10352a.g(view) - iN, 0));
                    if (iMin < 0) {
                        this.f10354c += Math.min(i11, -iMin);
                        return;
                    }
                    return;
                }
                return;
            }
            int iG = this.f10352a.g(view);
            int iN2 = iG - this.f10352a.n();
            this.f10354c = iG;
            if (iN2 > 0) {
                int i12 = (this.f10352a.i() - Math.min(0, (this.f10352a.i() - iP) - this.f10352a.d(view))) - (iG + this.f10352a.e(view));
                if (i12 < 0) {
                    this.f10354c -= Math.min(iN2, -i12);
                }
            }
        }

        boolean d(View view, RecyclerView.A a10) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return !qVar.c() && qVar.a() >= 0 && qVar.a() < a10.b();
        }

        void e() {
            this.f10353b = -1;
            this.f10354c = LinearLayoutManager.INVALID_OFFSET;
            this.f10355d = false;
            this.f10356e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f10353b + ", mCoordinate=" + this.f10354c + ", mLayoutFromEnd=" + this.f10355d + ", mValid=" + this.f10356e + '}';
        }
    }

    protected static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10357a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f10358b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f10359c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f10360d;

        protected b() {
        }

        void a() {
            this.f10357a = 0;
            this.f10358b = false;
            this.f10359c = false;
            this.f10360d = false;
        }
    }

    static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f10362b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f10363c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f10364d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f10365e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f10366f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f10367g;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f10371k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f10373m;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f10361a = true;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f10368h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f10369i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f10370j = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        List f10372l = null;

        c() {
        }

        private View e() {
            int size = this.f10372l.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = ((RecyclerView.D) this.f10372l.get(i10)).itemView;
                RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
                if (!qVar.c() && this.f10364d == qVar.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public void a() {
            b(null);
        }

        public void b(View view) {
            View viewF = f(view);
            if (viewF == null) {
                this.f10364d = -1;
            } else {
                this.f10364d = ((RecyclerView.q) viewF.getLayoutParams()).a();
            }
        }

        boolean c(RecyclerView.A a10) {
            int i10 = this.f10364d;
            return i10 >= 0 && i10 < a10.b();
        }

        View d(RecyclerView.v vVar) {
            if (this.f10372l != null) {
                return e();
            }
            View viewO = vVar.o(this.f10364d);
            this.f10364d += this.f10365e;
            return viewO;
        }

        public View f(View view) {
            int iA;
            int size = this.f10372l.size();
            View view2 = null;
            int i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            for (int i11 = 0; i11 < size; i11++) {
                View view3 = ((RecyclerView.D) this.f10372l.get(i11)).itemView;
                RecyclerView.q qVar = (RecyclerView.q) view3.getLayoutParams();
                if (view3 != view && !qVar.c() && (iA = (qVar.a() - this.f10364d) * this.f10365e) >= 0 && iA < i10) {
                    if (iA == 0) {
                        return view3;
                    }
                    view2 = view3;
                    i10 = iA;
                }
            }
            return view2;
        }
    }

    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f10374a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f10375b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f10376c;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d() {
        }

        boolean a() {
            return this.f10374a >= 0;
        }

        void b() {
            this.f10374a = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f10374a);
            parcel.writeInt(this.f10375b);
            parcel.writeInt(this.f10376c ? 1 : 0);
        }

        d(Parcel parcel) {
            this.f10374a = parcel.readInt();
            this.f10375b = parcel.readInt();
            this.f10376c = parcel.readInt() == 1;
        }

        public d(d dVar) {
            this.f10374a = dVar.f10374a;
            this.f10375b = dVar.f10375b;
            this.f10376c = dVar.f10376c;
        }
    }

    public LinearLayoutManager(Context context, int i10, boolean z9) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = INVALID_OFFSET;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new a();
        this.mLayoutChunkResult = new b();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i10);
        setReverseLayout(z9);
    }

    private void A(RecyclerView.v vVar, int i10, int i11) {
        if (i10 < 0) {
            return;
        }
        int i12 = i10 - i11;
        int childCount = getChildCount();
        if (!this.mShouldReverseLayout) {
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (this.mOrientationHelper.d(childAt) > i12 || this.mOrientationHelper.q(childAt) > i12) {
                    y(vVar, 0, i13);
                    return;
                }
            }
            return;
        }
        int i14 = childCount - 1;
        for (int i15 = i14; i15 >= 0; i15--) {
            View childAt2 = getChildAt(i15);
            if (this.mOrientationHelper.d(childAt2) > i12 || this.mOrientationHelper.q(childAt2) > i12) {
                y(vVar, i14, i15);
                return;
            }
        }
    }

    private void B() {
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            this.mShouldReverseLayout = this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = !this.mReverseLayout;
        }
    }

    private boolean C(RecyclerView.v vVar, RecyclerView.A a10, a aVar) {
        View viewFindReferenceChild;
        boolean z9 = false;
        if (getChildCount() == 0) {
            return false;
        }
        View focusedChild = getFocusedChild();
        if (focusedChild != null && aVar.d(focusedChild, a10)) {
            aVar.c(focusedChild, getPosition(focusedChild));
            return true;
        }
        boolean z10 = this.mLastStackFromEnd;
        boolean z11 = this.mStackFromEnd;
        if (z10 != z11 || (viewFindReferenceChild = findReferenceChild(vVar, a10, aVar.f10355d, z11)) == null) {
            return false;
        }
        aVar.b(viewFindReferenceChild, getPosition(viewFindReferenceChild));
        if (!a10.e() && supportsPredictiveItemAnimations()) {
            int iG = this.mOrientationHelper.g(viewFindReferenceChild);
            int iD = this.mOrientationHelper.d(viewFindReferenceChild);
            int iN = this.mOrientationHelper.n();
            int i10 = this.mOrientationHelper.i();
            boolean z12 = iD <= iN && iG < iN;
            if (iG >= i10 && iD > i10) {
                z9 = true;
            }
            if (z12 || z9) {
                if (aVar.f10355d) {
                    iN = i10;
                }
                aVar.f10354c = iN;
            }
        }
        return true;
    }

    private boolean D(RecyclerView.A a10, a aVar) {
        int i10;
        if (!a10.e() && (i10 = this.mPendingScrollPosition) != -1) {
            if (i10 >= 0 && i10 < a10.b()) {
                aVar.f10353b = this.mPendingScrollPosition;
                d dVar = this.mPendingSavedState;
                if (dVar != null && dVar.a()) {
                    boolean z9 = this.mPendingSavedState.f10376c;
                    aVar.f10355d = z9;
                    if (z9) {
                        aVar.f10354c = this.mOrientationHelper.i() - this.mPendingSavedState.f10375b;
                    } else {
                        aVar.f10354c = this.mOrientationHelper.n() + this.mPendingSavedState.f10375b;
                    }
                    return true;
                }
                if (this.mPendingScrollPositionOffset != Integer.MIN_VALUE) {
                    boolean z10 = this.mShouldReverseLayout;
                    aVar.f10355d = z10;
                    if (z10) {
                        aVar.f10354c = this.mOrientationHelper.i() - this.mPendingScrollPositionOffset;
                    } else {
                        aVar.f10354c = this.mOrientationHelper.n() + this.mPendingScrollPositionOffset;
                    }
                    return true;
                }
                View viewFindViewByPosition = findViewByPosition(this.mPendingScrollPosition);
                if (viewFindViewByPosition == null) {
                    if (getChildCount() > 0) {
                        aVar.f10355d = (this.mPendingScrollPosition < getPosition(getChildAt(0))) == this.mShouldReverseLayout;
                    }
                    aVar.a();
                } else {
                    if (this.mOrientationHelper.e(viewFindViewByPosition) > this.mOrientationHelper.o()) {
                        aVar.a();
                        return true;
                    }
                    if (this.mOrientationHelper.g(viewFindViewByPosition) - this.mOrientationHelper.n() < 0) {
                        aVar.f10354c = this.mOrientationHelper.n();
                        aVar.f10355d = false;
                        return true;
                    }
                    if (this.mOrientationHelper.i() - this.mOrientationHelper.d(viewFindViewByPosition) < 0) {
                        aVar.f10354c = this.mOrientationHelper.i();
                        aVar.f10355d = true;
                        return true;
                    }
                    aVar.f10354c = aVar.f10355d ? this.mOrientationHelper.d(viewFindViewByPosition) + this.mOrientationHelper.p() : this.mOrientationHelper.g(viewFindViewByPosition);
                }
                return true;
            }
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = INVALID_OFFSET;
        }
        return false;
    }

    private void E(RecyclerView.v vVar, RecyclerView.A a10, a aVar) {
        if (D(a10, aVar) || C(vVar, a10, aVar)) {
            return;
        }
        aVar.a();
        aVar.f10353b = this.mStackFromEnd ? a10.b() - 1 : 0;
    }

    private void F(int i10, int i11, boolean z9, RecyclerView.A a10) {
        int iN;
        this.mLayoutState.f10373m = resolveIsInfinite();
        this.mLayoutState.f10366f = i10;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(a10, iArr);
        int iMax = Math.max(0, this.mReusableIntPair[0]);
        int iMax2 = Math.max(0, this.mReusableIntPair[1]);
        boolean z10 = i10 == 1;
        c cVar = this.mLayoutState;
        int i12 = z10 ? iMax2 : iMax;
        cVar.f10368h = i12;
        if (!z10) {
            iMax = iMax2;
        }
        cVar.f10369i = iMax;
        if (z10) {
            cVar.f10368h = i12 + this.mOrientationHelper.j();
            View viewT = t();
            c cVar2 = this.mLayoutState;
            cVar2.f10365e = this.mShouldReverseLayout ? -1 : 1;
            int position = getPosition(viewT);
            c cVar3 = this.mLayoutState;
            cVar2.f10364d = position + cVar3.f10365e;
            cVar3.f10362b = this.mOrientationHelper.d(viewT);
            iN = this.mOrientationHelper.d(viewT) - this.mOrientationHelper.i();
        } else {
            View viewU = u();
            this.mLayoutState.f10368h += this.mOrientationHelper.n();
            c cVar4 = this.mLayoutState;
            cVar4.f10365e = this.mShouldReverseLayout ? 1 : -1;
            int position2 = getPosition(viewU);
            c cVar5 = this.mLayoutState;
            cVar4.f10364d = position2 + cVar5.f10365e;
            cVar5.f10362b = this.mOrientationHelper.g(viewU);
            iN = (-this.mOrientationHelper.g(viewU)) + this.mOrientationHelper.n();
        }
        c cVar6 = this.mLayoutState;
        cVar6.f10363c = i11;
        if (z9) {
            cVar6.f10363c = i11 - iN;
        }
        cVar6.f10367g = iN;
    }

    private void G(int i10, int i11) {
        this.mLayoutState.f10363c = this.mOrientationHelper.i() - i11;
        c cVar = this.mLayoutState;
        cVar.f10365e = this.mShouldReverseLayout ? -1 : 1;
        cVar.f10364d = i10;
        cVar.f10366f = 1;
        cVar.f10362b = i11;
        cVar.f10367g = INVALID_OFFSET;
    }

    private void H(a aVar) {
        G(aVar.f10353b, aVar.f10354c);
    }

    private void I(int i10, int i11) {
        this.mLayoutState.f10363c = i11 - this.mOrientationHelper.n();
        c cVar = this.mLayoutState;
        cVar.f10364d = i10;
        cVar.f10365e = this.mShouldReverseLayout ? 1 : -1;
        cVar.f10366f = -1;
        cVar.f10362b = i11;
        cVar.f10367g = INVALID_OFFSET;
    }

    private void J(a aVar) {
        I(aVar.f10353b, aVar.f10354c);
    }

    private int k(RecyclerView.A a10) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return l.a(a10, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private int l(RecyclerView.A a10) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return l.b(a10, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int m(RecyclerView.A a10) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return l.c(a10, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private View n() {
        return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
    }

    private View o() {
        return findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
    }

    private View p() {
        return this.mShouldReverseLayout ? n() : o();
    }

    private View q() {
        return this.mShouldReverseLayout ? o() : n();
    }

    private int r(int i10, RecyclerView.v vVar, RecyclerView.A a10, boolean z9) {
        int i11;
        int i12 = this.mOrientationHelper.i() - i10;
        if (i12 <= 0) {
            return 0;
        }
        int i13 = -scrollBy(-i12, vVar, a10);
        int i14 = i10 + i13;
        if (!z9 || (i11 = this.mOrientationHelper.i() - i14) <= 0) {
            return i13;
        }
        this.mOrientationHelper.s(i11);
        return i11 + i13;
    }

    private int s(int i10, RecyclerView.v vVar, RecyclerView.A a10, boolean z9) {
        int iN;
        int iN2 = i10 - this.mOrientationHelper.n();
        if (iN2 <= 0) {
            return 0;
        }
        int i11 = -scrollBy(iN2, vVar, a10);
        int i12 = i10 + i11;
        if (!z9 || (iN = i12 - this.mOrientationHelper.n()) <= 0) {
            return i11;
        }
        this.mOrientationHelper.s(-iN);
        return i11 - iN;
    }

    private View t() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    private View u() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    private void v(RecyclerView.v vVar, RecyclerView.A a10, int i10, int i11) {
        if (!a10.g() || getChildCount() == 0 || a10.e() || !supportsPredictiveItemAnimations()) {
            return;
        }
        List listK = vVar.k();
        int size = listK.size();
        int position = getPosition(getChildAt(0));
        int iE = 0;
        int iE2 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView.D d10 = (RecyclerView.D) listK.get(i12);
            if (!d10.isRemoved()) {
                if ((d10.getLayoutPosition() < position) != this.mShouldReverseLayout) {
                    iE += this.mOrientationHelper.e(d10.itemView);
                } else {
                    iE2 += this.mOrientationHelper.e(d10.itemView);
                }
            }
        }
        this.mLayoutState.f10372l = listK;
        if (iE > 0) {
            I(getPosition(u()), i10);
            c cVar = this.mLayoutState;
            cVar.f10368h = iE;
            cVar.f10363c = 0;
            cVar.a();
            fill(vVar, this.mLayoutState, a10, false);
        }
        if (iE2 > 0) {
            G(getPosition(t()), i11);
            c cVar2 = this.mLayoutState;
            cVar2.f10368h = iE2;
            cVar2.f10363c = 0;
            cVar2.a();
            fill(vVar, this.mLayoutState, a10, false);
        }
        this.mLayoutState.f10372l = null;
    }

    private void w() {
        Log.d(TAG, "internal representation of views on the screen");
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            Log.d(TAG, "item " + getPosition(childAt) + ", coord:" + this.mOrientationHelper.g(childAt));
        }
        Log.d(TAG, "==============");
    }

    private void x(RecyclerView.v vVar, c cVar) {
        if (!cVar.f10361a || cVar.f10373m) {
            return;
        }
        int i10 = cVar.f10367g;
        int i11 = cVar.f10369i;
        if (cVar.f10366f == -1) {
            z(vVar, i10, i11);
        } else {
            A(vVar, i10, i11);
        }
    }

    private void y(RecyclerView.v vVar, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                removeAndRecycleViewAt(i10, vVar);
                i10--;
            }
        } else {
            for (int i12 = i11 - 1; i12 >= i10; i12--) {
                removeAndRecycleViewAt(i12, vVar);
            }
        }
    }

    private void z(RecyclerView.v vVar, int i10, int i11) {
        int childCount = getChildCount();
        if (i10 < 0) {
            return;
        }
        int iH = (this.mOrientationHelper.h() - i10) + i11;
        if (this.mShouldReverseLayout) {
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (this.mOrientationHelper.g(childAt) < iH || this.mOrientationHelper.r(childAt) < iH) {
                    y(vVar, 0, i12);
                    return;
                }
            }
            return;
        }
        int i13 = childCount - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            View childAt2 = getChildAt(i14);
            if (this.mOrientationHelper.g(childAt2) < iH || this.mOrientationHelper.r(childAt2) < iH) {
                y(vVar, i13, i14);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    protected void calculateExtraLayoutSpace(RecyclerView.A a10, int[] iArr) {
        int i10;
        int extraLayoutSpace = getExtraLayoutSpace(a10);
        if (this.mLayoutState.f10366f == -1) {
            i10 = 0;
        } else {
            i10 = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void collectAdjacentPrefetchPositions(int i10, int i11, RecyclerView.A a10, RecyclerView.p.c cVar) {
        if (this.mOrientation != 0) {
            i10 = i11;
        }
        if (getChildCount() == 0 || i10 == 0) {
            return;
        }
        ensureLayoutState();
        F(i10 > 0 ? 1 : -1, Math.abs(i10), true, a10);
        collectPrefetchPositionsForLayoutState(a10, this.mLayoutState, cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void collectInitialPrefetchPositions(int i10, RecyclerView.p.c cVar) {
        boolean z9;
        int i11;
        d dVar = this.mPendingSavedState;
        if (dVar == null || !dVar.a()) {
            B();
            z9 = this.mShouldReverseLayout;
            i11 = this.mPendingScrollPosition;
            if (i11 == -1) {
                i11 = z9 ? i10 - 1 : 0;
            }
        } else {
            d dVar2 = this.mPendingSavedState;
            z9 = dVar2.f10376c;
            i11 = dVar2.f10374a;
        }
        int i12 = z9 ? -1 : 1;
        for (int i13 = 0; i13 < this.mInitialPrefetchItemCount && i11 >= 0 && i11 < i10; i13++) {
            cVar.a(i11, 0);
            i11 += i12;
        }
    }

    void collectPrefetchPositionsForLayoutState(RecyclerView.A a10, c cVar, RecyclerView.p.c cVar2) {
        int i10 = cVar.f10364d;
        if (i10 < 0 || i10 >= a10.b()) {
            return;
        }
        cVar2.a(i10, Math.max(0, cVar.f10367g));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollExtent(RecyclerView.A a10) {
        return k(a10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollOffset(RecyclerView.A a10) {
        return l(a10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollRange(RecyclerView.A a10) {
        return m(a10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public PointF computeScrollVectorForPosition(int i10) {
        if (getChildCount() == 0) {
            return null;
        }
        int i11 = (i10 < getPosition(getChildAt(0))) != this.mShouldReverseLayout ? -1 : 1;
        return this.mOrientation == 0 ? new PointF(i11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : new PointF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollExtent(RecyclerView.A a10) {
        return k(a10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollOffset(RecyclerView.A a10) {
        return l(a10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollRange(RecyclerView.A a10) {
        return m(a10);
    }

    int convertFocusDirectionToLayoutDirection(int i10) {
        if (i10 == 1) {
            return (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
        }
        if (i10 == 2) {
            return (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1;
        }
        if (i10 == 17) {
            if (this.mOrientation == 0) {
                return -1;
            }
            return INVALID_OFFSET;
        }
        if (i10 == 33) {
            if (this.mOrientation == 1) {
                return -1;
            }
            return INVALID_OFFSET;
        }
        if (i10 == 66) {
            if (this.mOrientation == 0) {
                return 1;
            }
            return INVALID_OFFSET;
        }
        if (i10 == 130 && this.mOrientation == 1) {
            return 1;
        }
        return INVALID_OFFSET;
    }

    c createLayoutState() {
        return new c();
    }

    void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    int fill(RecyclerView.v vVar, c cVar, RecyclerView.A a10, boolean z9) {
        int i10 = cVar.f10363c;
        int i11 = cVar.f10367g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                cVar.f10367g = i11 + i10;
            }
            x(vVar, cVar);
        }
        int i12 = cVar.f10363c + cVar.f10368h;
        b bVar = this.mLayoutChunkResult;
        while (true) {
            if ((!cVar.f10373m && i12 <= 0) || !cVar.c(a10)) {
                break;
            }
            bVar.a();
            layoutChunk(vVar, a10, cVar, bVar);
            if (!bVar.f10358b) {
                cVar.f10362b += bVar.f10357a * cVar.f10366f;
                if (!bVar.f10359c || cVar.f10372l != null || !a10.e()) {
                    int i13 = cVar.f10363c;
                    int i14 = bVar.f10357a;
                    cVar.f10363c = i13 - i14;
                    i12 -= i14;
                }
                int i15 = cVar.f10367g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + bVar.f10357a;
                    cVar.f10367g = i16;
                    int i17 = cVar.f10363c;
                    if (i17 < 0) {
                        cVar.f10367g = i16 + i17;
                    }
                    x(vVar, cVar);
                }
                if (z9 && bVar.f10360d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - cVar.f10363c;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    View findFirstVisibleChildClosestToEnd(boolean z9, boolean z10) {
        return this.mShouldReverseLayout ? findOneVisibleChild(0, getChildCount(), z9, z10) : findOneVisibleChild(getChildCount() - 1, -1, z9, z10);
    }

    View findFirstVisibleChildClosestToStart(boolean z9, boolean z10) {
        return this.mShouldReverseLayout ? findOneVisibleChild(getChildCount() - 1, -1, z9, z10) : findOneVisibleChild(0, getChildCount(), z9, z10);
    }

    public int findFirstVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    View findOnePartiallyOrCompletelyInvisibleChild(int i10, int i11) {
        int i12;
        int i13;
        ensureLayoutState();
        if (i11 <= i10 && i11 >= i10) {
            return getChildAt(i10);
        }
        if (this.mOrientationHelper.g(getChildAt(i10)) < this.mOrientationHelper.n()) {
            i12 = 16644;
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = 4097;
        }
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.a(i10, i11, i12, i13) : this.mVerticalBoundCheck.a(i10, i11, i12, i13);
    }

    View findOneVisibleChild(int i10, int i11, boolean z9, boolean z10) {
        ensureLayoutState();
        int i12 = z9 ? 24579 : 320;
        int i13 = z10 ? 320 : 0;
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.a(i10, i11, i12, i13) : this.mVerticalBoundCheck.a(i10, i11, i12, i13);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0073  */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    View findReferenceChild(RecyclerView.v vVar, RecyclerView.A a10, boolean z9, boolean z10) {
        int i10;
        int childCount;
        int i11;
        ensureLayoutState();
        int childCount2 = getChildCount();
        if (z10) {
            childCount = getChildCount() - 1;
            i10 = -1;
            i11 = -1;
        } else {
            i10 = childCount2;
            childCount = 0;
            i11 = 1;
        }
        int iB = a10.b();
        int iN = this.mOrientationHelper.n();
        int i12 = this.mOrientationHelper.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (childCount != i10) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            int iG = this.mOrientationHelper.g(childAt);
            int iD = this.mOrientationHelper.d(childAt);
            if (position >= 0 && position < iB) {
                if (!((RecyclerView.q) childAt.getLayoutParams()).c()) {
                    boolean z11 = iD <= iN && iG < iN;
                    boolean z12 = iG >= i12 && iD > i12;
                    if (!z11 && !z12) {
                        return childAt;
                    }
                    if (z9) {
                        if (z12) {
                            view2 = childAt;
                        } else if (view == null) {
                            view = childAt;
                        }
                    } else if (z11) {
                        view2 = childAt;
                    } else if (view == null) {
                        view = childAt;
                    }
                } else if (view3 == null) {
                    view3 = childAt;
                }
            }
            childCount += i11;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View findViewByPosition(int i10) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i10 - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i10) {
                return childAt;
            }
        }
        return super.findViewByPosition(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q generateDefaultLayoutParams() {
        return new RecyclerView.q(-2, -2);
    }

    @Deprecated
    protected int getExtraLayoutSpace(RecyclerView.A a10) {
        if (a10.d()) {
            return this.mOrientationHelper.o();
        }
        return 0;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    protected boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    void layoutChunk(RecyclerView.v vVar, RecyclerView.A a10, c cVar, b bVar) {
        int iF;
        int i10;
        int i11;
        int i12;
        int paddingLeft;
        int iF2;
        int i13;
        int i14;
        View viewD = cVar.d(vVar);
        if (viewD == null) {
            bVar.f10358b = true;
            return;
        }
        RecyclerView.q qVar = (RecyclerView.q) viewD.getLayoutParams();
        if (cVar.f10372l == null) {
            if (this.mShouldReverseLayout == (cVar.f10366f == -1)) {
                addView(viewD);
            } else {
                addView(viewD, 0);
            }
        } else {
            if (this.mShouldReverseLayout == (cVar.f10366f == -1)) {
                addDisappearingView(viewD);
            } else {
                addDisappearingView(viewD, 0);
            }
        }
        measureChildWithMargins(viewD, 0, 0);
        bVar.f10357a = this.mOrientationHelper.e(viewD);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                iF2 = getWidth() - getPaddingRight();
                paddingLeft = iF2 - this.mOrientationHelper.f(viewD);
            } else {
                paddingLeft = getPaddingLeft();
                iF2 = this.mOrientationHelper.f(viewD) + paddingLeft;
            }
            if (cVar.f10366f == -1) {
                i14 = cVar.f10362b;
                i13 = i14 - bVar.f10357a;
            } else {
                i13 = cVar.f10362b;
                i14 = bVar.f10357a + i13;
            }
            int i15 = paddingLeft;
            i12 = i13;
            i11 = i15;
            iF = i14;
            i10 = iF2;
        } else {
            int paddingTop = getPaddingTop();
            iF = this.mOrientationHelper.f(viewD) + paddingTop;
            if (cVar.f10366f == -1) {
                int i16 = cVar.f10362b;
                i11 = i16 - bVar.f10357a;
                i10 = i16;
            } else {
                int i17 = cVar.f10362b;
                i10 = bVar.f10357a + i17;
                i11 = i17;
            }
            i12 = paddingTop;
        }
        layoutDecoratedWithMargins(viewD, i11, i12, i10, iF);
        if (qVar.c() || qVar.b()) {
            bVar.f10359c = true;
        }
        bVar.f10360d = viewD.hasFocusable();
    }

    void onAnchorReady(RecyclerView.v vVar, RecyclerView.A a10, a aVar, int i10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.onDetachedFromWindow(recyclerView, vVar);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(vVar);
            vVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View onFocusSearchFailed(View view, int i10, RecyclerView.v vVar, RecyclerView.A a10) {
        int iConvertFocusDirectionToLayoutDirection;
        B();
        if (getChildCount() == 0 || (iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        ensureLayoutState();
        F(iConvertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.o() * MAX_SCROLL_FACTOR), false, a10);
        c cVar = this.mLayoutState;
        cVar.f10367g = INVALID_OFFSET;
        cVar.f10361a = false;
        fill(vVar, cVar, a10, true);
        View viewQ = iConvertFocusDirectionToLayoutDirection == -1 ? q() : p();
        View viewU = iConvertFocusDirectionToLayoutDirection == -1 ? u() : t();
        if (!viewU.hasFocusable()) {
            return viewQ;
        }
        if (viewQ == null) {
            return null;
        }
        return viewU;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onLayoutChildren(RecyclerView.v vVar, RecyclerView.A a10) {
        int i10;
        int i11;
        int i12;
        int i13;
        int iR;
        int i14;
        View viewFindViewByPosition;
        int iG;
        int i15;
        int i16 = -1;
        if (!(this.mPendingSavedState == null && this.mPendingScrollPosition == -1) && a10.b() == 0) {
            removeAndRecycleAllViews(vVar);
            return;
        }
        d dVar = this.mPendingSavedState;
        if (dVar != null && dVar.a()) {
            this.mPendingScrollPosition = this.mPendingSavedState.f10374a;
        }
        ensureLayoutState();
        this.mLayoutState.f10361a = false;
        B();
        View focusedChild = getFocusedChild();
        a aVar = this.mAnchorInfo;
        if (!aVar.f10356e || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            aVar.e();
            a aVar2 = this.mAnchorInfo;
            aVar2.f10355d = this.mShouldReverseLayout ^ this.mStackFromEnd;
            E(vVar, a10, aVar2);
            this.mAnchorInfo.f10356e = true;
        } else if (focusedChild != null && (this.mOrientationHelper.g(focusedChild) >= this.mOrientationHelper.i() || this.mOrientationHelper.d(focusedChild) <= this.mOrientationHelper.n())) {
            this.mAnchorInfo.c(focusedChild, getPosition(focusedChild));
        }
        c cVar = this.mLayoutState;
        cVar.f10366f = cVar.f10371k >= 0 ? 1 : -1;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(a10, iArr);
        int iMax = Math.max(0, this.mReusableIntPair[0]) + this.mOrientationHelper.n();
        int iMax2 = Math.max(0, this.mReusableIntPair[1]) + this.mOrientationHelper.j();
        if (a10.e() && (i14 = this.mPendingScrollPosition) != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (viewFindViewByPosition = findViewByPosition(i14)) != null) {
            if (this.mShouldReverseLayout) {
                i15 = this.mOrientationHelper.i() - this.mOrientationHelper.d(viewFindViewByPosition);
                iG = this.mPendingScrollPositionOffset;
            } else {
                iG = this.mOrientationHelper.g(viewFindViewByPosition) - this.mOrientationHelper.n();
                i15 = this.mPendingScrollPositionOffset;
            }
            int i17 = i15 - iG;
            if (i17 > 0) {
                iMax += i17;
            } else {
                iMax2 -= i17;
            }
        }
        a aVar3 = this.mAnchorInfo;
        if (!aVar3.f10355d ? !this.mShouldReverseLayout : this.mShouldReverseLayout) {
            i16 = 1;
        }
        onAnchorReady(vVar, a10, aVar3, i16);
        detachAndScrapAttachedViews(vVar);
        this.mLayoutState.f10373m = resolveIsInfinite();
        this.mLayoutState.f10370j = a10.e();
        this.mLayoutState.f10369i = 0;
        a aVar4 = this.mAnchorInfo;
        if (aVar4.f10355d) {
            J(aVar4);
            c cVar2 = this.mLayoutState;
            cVar2.f10368h = iMax;
            fill(vVar, cVar2, a10, false);
            c cVar3 = this.mLayoutState;
            i11 = cVar3.f10362b;
            int i18 = cVar3.f10364d;
            int i19 = cVar3.f10363c;
            if (i19 > 0) {
                iMax2 += i19;
            }
            H(this.mAnchorInfo);
            c cVar4 = this.mLayoutState;
            cVar4.f10368h = iMax2;
            cVar4.f10364d += cVar4.f10365e;
            fill(vVar, cVar4, a10, false);
            c cVar5 = this.mLayoutState;
            i10 = cVar5.f10362b;
            int i20 = cVar5.f10363c;
            if (i20 > 0) {
                I(i18, i11);
                c cVar6 = this.mLayoutState;
                cVar6.f10368h = i20;
                fill(vVar, cVar6, a10, false);
                i11 = this.mLayoutState.f10362b;
            }
        } else {
            H(aVar4);
            c cVar7 = this.mLayoutState;
            cVar7.f10368h = iMax2;
            fill(vVar, cVar7, a10, false);
            c cVar8 = this.mLayoutState;
            i10 = cVar8.f10362b;
            int i21 = cVar8.f10364d;
            int i22 = cVar8.f10363c;
            if (i22 > 0) {
                iMax += i22;
            }
            J(this.mAnchorInfo);
            c cVar9 = this.mLayoutState;
            cVar9.f10368h = iMax;
            cVar9.f10364d += cVar9.f10365e;
            fill(vVar, cVar9, a10, false);
            c cVar10 = this.mLayoutState;
            i11 = cVar10.f10362b;
            int i23 = cVar10.f10363c;
            if (i23 > 0) {
                G(i21, i10);
                c cVar11 = this.mLayoutState;
                cVar11.f10368h = i23;
                fill(vVar, cVar11, a10, false);
                i10 = this.mLayoutState.f10362b;
            }
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int iR2 = r(i10, vVar, a10, true);
                i12 = i11 + iR2;
                i13 = i10 + iR2;
                iR = s(i12, vVar, a10, false);
            } else {
                int iS = s(i11, vVar, a10, true);
                i12 = i11 + iS;
                i13 = i10 + iS;
                iR = r(i13, vVar, a10, false);
            }
            i11 = i12 + iR;
            i10 = i13 + iR;
        }
        v(vVar, a10, i11, i10);
        if (a10.e()) {
            this.mAnchorInfo.e();
        } else {
            this.mOrientationHelper.t();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onLayoutCompleted(RecyclerView.A a10) {
        super.onLayoutCompleted(a10);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = INVALID_OFFSET;
        this.mAnchorInfo.e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof d) {
            d dVar = (d) parcelable;
            this.mPendingSavedState = dVar;
            if (this.mPendingScrollPosition != -1) {
                dVar.b();
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable onSaveInstanceState() {
        if (this.mPendingSavedState != null) {
            return new d(this.mPendingSavedState);
        }
        d dVar = new d();
        if (getChildCount() <= 0) {
            dVar.b();
            return dVar;
        }
        ensureLayoutState();
        boolean z9 = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
        dVar.f10376c = z9;
        if (z9) {
            View viewT = t();
            dVar.f10375b = this.mOrientationHelper.i() - this.mOrientationHelper.d(viewT);
            dVar.f10374a = getPosition(viewT);
            return dVar;
        }
        View viewU = u();
        dVar.f10374a = getPosition(viewU);
        dVar.f10375b = this.mOrientationHelper.g(viewU) - this.mOrientationHelper.n();
        return dVar;
    }

    public void prepareForDrop(@NonNull View view, @NonNull View view2, int i10, int i11) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        B();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        byte b10 = position < position2 ? (byte) 1 : (byte) -1;
        if (this.mShouldReverseLayout) {
            if (b10 == 1) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.i() - (this.mOrientationHelper.g(view2) + this.mOrientationHelper.e(view)));
                return;
            } else {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.i() - this.mOrientationHelper.d(view2));
                return;
            }
        }
        if (b10 == -1) {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.g(view2));
        } else {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.d(view2) - this.mOrientationHelper.e(view));
        }
    }

    boolean resolveIsInfinite() {
        return this.mOrientationHelper.l() == 0 && this.mOrientationHelper.h() == 0;
    }

    int scrollBy(int i10, RecyclerView.v vVar, RecyclerView.A a10) {
        if (getChildCount() == 0 || i10 == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.f10361a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int iAbs = Math.abs(i10);
        F(i11, iAbs, true, a10);
        c cVar = this.mLayoutState;
        int iFill = cVar.f10367g + fill(vVar, cVar, a10, false);
        if (iFill < 0) {
            return 0;
        }
        if (iAbs > iFill) {
            i10 = i11 * iFill;
        }
        this.mOrientationHelper.s(-i10);
        this.mLayoutState.f10371k = i10;
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int scrollHorizontallyBy(int i10, RecyclerView.v vVar, RecyclerView.A a10) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i10, vVar, a10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void scrollToPosition(int i10) {
        this.mPendingScrollPosition = i10;
        this.mPendingScrollPositionOffset = INVALID_OFFSET;
        d dVar = this.mPendingSavedState;
        if (dVar != null) {
            dVar.b();
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i10, int i11) {
        this.mPendingScrollPosition = i10;
        this.mPendingScrollPositionOffset = i11;
        d dVar = this.mPendingSavedState;
        if (dVar != null) {
            dVar.b();
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int scrollVerticallyBy(int i10, RecyclerView.v vVar, RecyclerView.A a10) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i10, vVar, a10);
    }

    public void setInitialPrefetchItemCount(int i10) {
        this.mInitialPrefetchItemCount = i10;
    }

    public void setOrientation(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i10);
        }
        assertNotInLayoutOrScroll(null);
        if (i10 != this.mOrientation || this.mOrientationHelper == null) {
            i iVarB = i.b(this, i10);
            this.mOrientationHelper = iVarB;
            this.mAnchorInfo.f10352a = iVarB;
            this.mOrientation = i10;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z9) {
        this.mRecycleChildrenOnDetach = z9;
    }

    public void setReverseLayout(boolean z9) {
        assertNotInLayoutOrScroll(null);
        if (z9 == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z9;
        requestLayout();
    }

    public void setSmoothScrollbarEnabled(boolean z9) {
        this.mSmoothScrollbarEnabled = z9;
    }

    public void setStackFromEnd(boolean z9) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z9) {
            return;
        }
        this.mStackFromEnd = z9;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.A a10, int i10) {
        g gVar = new g(recyclerView.getContext());
        gVar.setTargetPosition(i10);
        startSmoothScroll(gVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    void validateChildOrder() {
        Log.d(TAG, "validating child count " + getChildCount());
        if (getChildCount() < 1) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int iG = this.mOrientationHelper.g(getChildAt(0));
        if (this.mShouldReverseLayout) {
            for (int i10 = 1; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                int position2 = getPosition(childAt);
                int iG2 = this.mOrientationHelper.g(childAt);
                if (position2 < position) {
                    w();
                    StringBuilder sb = new StringBuilder();
                    sb.append("detected invalid position. loc invalid? ");
                    sb.append(iG2 < iG);
                    throw new RuntimeException(sb.toString());
                }
                if (iG2 > iG) {
                    w();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i11 = 1; i11 < getChildCount(); i11++) {
            View childAt2 = getChildAt(i11);
            int position3 = getPosition(childAt2);
            int iG3 = this.mOrientationHelper.g(childAt2);
            if (position3 < position) {
                w();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("detected invalid position. loc invalid? ");
                sb2.append(iG3 < iG);
                throw new RuntimeException(sb2.toString());
            }
            if (iG3 < iG) {
                w();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = INVALID_OFFSET;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new a();
        this.mLayoutChunkResult = new b();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        RecyclerView.p.d properties = RecyclerView.p.getProperties(context, attributeSet, i10, i11);
        setOrientation(properties.f10509a);
        setReverseLayout(properties.f10511c);
        setStackFromEnd(properties.f10512d);
    }
}

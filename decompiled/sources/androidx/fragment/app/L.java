package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.AbstractC1164j;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes.dex */
final class L implements Parcelable {
    public static final Parcelable.Creator<L> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f9886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f9887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f9888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f9889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f9890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final String f9891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final boolean f9892g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final boolean f9893h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final boolean f9894i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final boolean f9895j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final int f9896k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final String f9897l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final int f9898m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final boolean f9899v;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public L createFromParcel(Parcel parcel) {
            return new L(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public L[] newArray(int i10) {
            return new L[i10];
        }
    }

    L(ComponentCallbacksC1144o componentCallbacksC1144o) {
        this.f9886a = componentCallbacksC1144o.getClass().getName();
        this.f9887b = componentCallbacksC1144o.mWho;
        this.f9888c = componentCallbacksC1144o.mFromLayout;
        this.f9889d = componentCallbacksC1144o.mFragmentId;
        this.f9890e = componentCallbacksC1144o.mContainerId;
        this.f9891f = componentCallbacksC1144o.mTag;
        this.f9892g = componentCallbacksC1144o.mRetainInstance;
        this.f9893h = componentCallbacksC1144o.mRemoving;
        this.f9894i = componentCallbacksC1144o.mDetached;
        this.f9895j = componentCallbacksC1144o.mHidden;
        this.f9896k = componentCallbacksC1144o.mMaxState.ordinal();
        this.f9897l = componentCallbacksC1144o.mTargetWho;
        this.f9898m = componentCallbacksC1144o.mTargetRequestCode;
        this.f9899v = componentCallbacksC1144o.mUserVisibleHint;
    }

    ComponentCallbacksC1144o a(AbstractC1152x abstractC1152x, ClassLoader classLoader) {
        ComponentCallbacksC1144o componentCallbacksC1144oA = abstractC1152x.a(classLoader, this.f9886a);
        componentCallbacksC1144oA.mWho = this.f9887b;
        componentCallbacksC1144oA.mFromLayout = this.f9888c;
        componentCallbacksC1144oA.mRestored = true;
        componentCallbacksC1144oA.mFragmentId = this.f9889d;
        componentCallbacksC1144oA.mContainerId = this.f9890e;
        componentCallbacksC1144oA.mTag = this.f9891f;
        componentCallbacksC1144oA.mRetainInstance = this.f9892g;
        componentCallbacksC1144oA.mRemoving = this.f9893h;
        componentCallbacksC1144oA.mDetached = this.f9894i;
        componentCallbacksC1144oA.mHidden = this.f9895j;
        componentCallbacksC1144oA.mMaxState = AbstractC1164j.b.values()[this.f9896k];
        componentCallbacksC1144oA.mTargetWho = this.f9897l;
        componentCallbacksC1144oA.mTargetRequestCode = this.f9898m;
        componentCallbacksC1144oA.mUserVisibleHint = this.f9899v;
        return componentCallbacksC1144oA;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        sb.append("FragmentState{");
        sb.append(this.f9886a);
        sb.append(" (");
        sb.append(this.f9887b);
        sb.append(")}:");
        if (this.f9888c) {
            sb.append(" fromLayout");
        }
        if (this.f9890e != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f9890e));
        }
        String str = this.f9891f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f9891f);
        }
        if (this.f9892g) {
            sb.append(" retainInstance");
        }
        if (this.f9893h) {
            sb.append(" removing");
        }
        if (this.f9894i) {
            sb.append(" detached");
        }
        if (this.f9895j) {
            sb.append(" hidden");
        }
        if (this.f9897l != null) {
            sb.append(" targetWho=");
            sb.append(this.f9897l);
            sb.append(" targetRequestCode=");
            sb.append(this.f9898m);
        }
        if (this.f9899v) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f9886a);
        parcel.writeString(this.f9887b);
        parcel.writeInt(this.f9888c ? 1 : 0);
        parcel.writeInt(this.f9889d);
        parcel.writeInt(this.f9890e);
        parcel.writeString(this.f9891f);
        parcel.writeInt(this.f9892g ? 1 : 0);
        parcel.writeInt(this.f9893h ? 1 : 0);
        parcel.writeInt(this.f9894i ? 1 : 0);
        parcel.writeInt(this.f9895j ? 1 : 0);
        parcel.writeInt(this.f9896k);
        parcel.writeString(this.f9897l);
        parcel.writeInt(this.f9898m);
        parcel.writeInt(this.f9899v ? 1 : 0);
    }

    L(Parcel parcel) {
        this.f9886a = parcel.readString();
        this.f9887b = parcel.readString();
        this.f9888c = parcel.readInt() != 0;
        this.f9889d = parcel.readInt();
        this.f9890e = parcel.readInt();
        this.f9891f = parcel.readString();
        this.f9892g = parcel.readInt() != 0;
        this.f9893h = parcel.readInt() != 0;
        this.f9894i = parcel.readInt() != 0;
        this.f9895j = parcel.readInt() != 0;
        this.f9896k = parcel.readInt();
        this.f9897l = parcel.readString();
        this.f9898m = parcel.readInt();
        this.f9899v = parcel.readInt() != 0;
    }
}

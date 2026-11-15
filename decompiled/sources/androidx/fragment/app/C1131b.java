package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.AbstractC1164j;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1131b implements Parcelable {
    public static final Parcelable.Creator<C1131b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int[] f10008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ArrayList f10009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int[] f10010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int[] f10011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f10012e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final String f10013f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f10014g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final int f10015h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final CharSequence f10016i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int f10017j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final CharSequence f10018k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final ArrayList f10019l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final ArrayList f10020m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final boolean f10021v;

    /* JADX INFO: renamed from: androidx.fragment.app.b$a */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1131b createFromParcel(Parcel parcel) {
            return new C1131b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1131b[] newArray(int i10) {
            return new C1131b[i10];
        }
    }

    C1131b(C1130a c1130a) {
        int size = c1130a.f9914c.size();
        this.f10008a = new int[size * 6];
        if (!c1130a.f9920i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f10009b = new ArrayList(size);
        this.f10010c = new int[size];
        this.f10011d = new int[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            O.a aVar = (O.a) c1130a.f9914c.get(i11);
            int i12 = i10 + 1;
            this.f10008a[i10] = aVar.f9931a;
            ArrayList arrayList = this.f10009b;
            ComponentCallbacksC1144o componentCallbacksC1144o = aVar.f9932b;
            arrayList.add(componentCallbacksC1144o != null ? componentCallbacksC1144o.mWho : null);
            int[] iArr = this.f10008a;
            iArr[i12] = aVar.f9933c ? 1 : 0;
            iArr[i10 + 2] = aVar.f9934d;
            iArr[i10 + 3] = aVar.f9935e;
            int i13 = i10 + 5;
            iArr[i10 + 4] = aVar.f9936f;
            i10 += 6;
            iArr[i13] = aVar.f9937g;
            this.f10010c[i11] = aVar.f9938h.ordinal();
            this.f10011d[i11] = aVar.f9939i.ordinal();
        }
        this.f10012e = c1130a.f9919h;
        this.f10013f = c1130a.f9922k;
        this.f10014g = c1130a.f10006v;
        this.f10015h = c1130a.f9923l;
        this.f10016i = c1130a.f9924m;
        this.f10017j = c1130a.f9925n;
        this.f10018k = c1130a.f9926o;
        this.f10019l = c1130a.f9927p;
        this.f10020m = c1130a.f9928q;
        this.f10021v = c1130a.f9929r;
    }

    private void a(C1130a c1130a) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            boolean z9 = true;
            if (i10 >= this.f10008a.length) {
                c1130a.f9919h = this.f10012e;
                c1130a.f9922k = this.f10013f;
                c1130a.f9920i = true;
                c1130a.f9923l = this.f10015h;
                c1130a.f9924m = this.f10016i;
                c1130a.f9925n = this.f10017j;
                c1130a.f9926o = this.f10018k;
                c1130a.f9927p = this.f10019l;
                c1130a.f9928q = this.f10020m;
                c1130a.f9929r = this.f10021v;
                return;
            }
            O.a aVar = new O.a();
            int i12 = i10 + 1;
            aVar.f9931a = this.f10008a[i10];
            if (G.I0(2)) {
                Log.v("FragmentManager", "Instantiate " + c1130a + " op #" + i11 + " base fragment #" + this.f10008a[i12]);
            }
            aVar.f9938h = AbstractC1164j.b.values()[this.f10010c[i11]];
            aVar.f9939i = AbstractC1164j.b.values()[this.f10011d[i11]];
            int[] iArr = this.f10008a;
            int i13 = i10 + 2;
            if (iArr[i12] == 0) {
                z9 = false;
            }
            aVar.f9933c = z9;
            int i14 = iArr[i13];
            aVar.f9934d = i14;
            int i15 = iArr[i10 + 3];
            aVar.f9935e = i15;
            int i16 = i10 + 5;
            int i17 = iArr[i10 + 4];
            aVar.f9936f = i17;
            i10 += 6;
            int i18 = iArr[i16];
            aVar.f9937g = i18;
            c1130a.f9915d = i14;
            c1130a.f9916e = i15;
            c1130a.f9917f = i17;
            c1130a.f9918g = i18;
            c1130a.f(aVar);
            i11++;
        }
    }

    public C1130a b(G g10) {
        C1130a c1130a = new C1130a(g10);
        a(c1130a);
        c1130a.f10006v = this.f10014g;
        for (int i10 = 0; i10 < this.f10009b.size(); i10++) {
            String str = (String) this.f10009b.get(i10);
            if (str != null) {
                ((O.a) c1130a.f9914c.get(i10)).f9932b = g10.e0(str);
            }
        }
        c1130a.t(1);
        return c1130a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f10008a);
        parcel.writeStringList(this.f10009b);
        parcel.writeIntArray(this.f10010c);
        parcel.writeIntArray(this.f10011d);
        parcel.writeInt(this.f10012e);
        parcel.writeString(this.f10013f);
        parcel.writeInt(this.f10014g);
        parcel.writeInt(this.f10015h);
        TextUtils.writeToParcel(this.f10016i, parcel, 0);
        parcel.writeInt(this.f10017j);
        TextUtils.writeToParcel(this.f10018k, parcel, 0);
        parcel.writeStringList(this.f10019l);
        parcel.writeStringList(this.f10020m);
        parcel.writeInt(this.f10021v ? 1 : 0);
    }

    C1131b(Parcel parcel) {
        this.f10008a = parcel.createIntArray();
        this.f10009b = parcel.createStringArrayList();
        this.f10010c = parcel.createIntArray();
        this.f10011d = parcel.createIntArray();
        this.f10012e = parcel.readInt();
        this.f10013f = parcel.readString();
        this.f10014g = parcel.readInt();
        this.f10015h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f10016i = (CharSequence) creator.createFromParcel(parcel);
        this.f10017j = parcel.readInt();
        this.f10018k = (CharSequence) creator.createFromParcel(parcel);
        this.f10019l = parcel.createStringArrayList();
        this.f10020m = parcel.createStringArrayList();
        this.f10021v = parcel.readInt() != 0;
    }
}

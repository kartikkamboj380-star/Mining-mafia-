package V6;

import X6.l;
import Y6.k;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0096a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f6129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f6130c;

    /* JADX INFO: renamed from: V6.a$a, reason: collision with other inner class name */
    class C0096a implements Parcelable.Creator {
        C0096a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, (C0096a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* synthetic */ a(Parcel parcel, C0096a c0096a) {
        this(parcel);
    }

    public static k[] b(List list) {
        if (list.isEmpty()) {
            return null;
        }
        k[] kVarArr = new k[list.size()];
        k kVarA = ((a) list.get(0)).a();
        boolean z9 = false;
        for (int i10 = 1; i10 < list.size(); i10++) {
            k kVarA2 = ((a) list.get(i10)).a();
            if (z9 || !((a) list.get(i10)).g()) {
                kVarArr[i10] = kVarA2;
            } else {
                kVarArr[0] = kVarA2;
                kVarArr[i10] = kVarA;
                z9 = true;
            }
        }
        if (!z9) {
            kVarArr[0] = kVarA;
        }
        return kVarArr;
    }

    public static a c(String str) {
        a aVar = new a(str.replace("-", ""), new X6.a());
        aVar.i(j());
        return aVar;
    }

    public static boolean j() {
        com.google.firebase.perf.config.a aVarG = com.google.firebase.perf.config.a.g();
        return aVarG.K() && Math.random() < aVarG.D();
    }

    public k a() {
        k.c cVarI = k.n().i(this.f6128a);
        if (this.f6130c) {
            cVarI.h(Y6.l.GAUGES_AND_SYSTEM_EVENTS);
        }
        return (k) cVarI.build();
    }

    public l d() {
        return this.f6129b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean e() {
        return this.f6130c;
    }

    public boolean f() {
        return TimeUnit.MICROSECONDS.toMinutes(this.f6129b.c()) > com.google.firebase.perf.config.a.g().A();
    }

    public boolean g() {
        return this.f6130c;
    }

    public String h() {
        return this.f6128a;
    }

    public void i(boolean z9) {
        this.f6130c = z9;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f6128a);
        parcel.writeByte(this.f6130c ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f6129b, 0);
    }

    public a(String str, X6.a aVar) {
        this.f6130c = false;
        this.f6128a = str;
        this.f6129b = aVar.a();
    }

    private a(Parcel parcel) {
        this.f6130c = false;
        this.f6128a = parcel.readString();
        this.f6130c = parcel.readByte() != 0;
        this.f6129b = (l) parcel.readParcelable(l.class.getClassLoader());
    }
}

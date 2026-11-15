package p040e;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f43196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Intent f43197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f43195c = new b(null);

    @NotNull
    public static final Parcelable.Creator<a> CREATOR = new C0414a();

    /* JADX INFO: renamed from: e.a$a, reason: collision with other inner class name */
    public static final class C0414a implements Parcelable.Creator {
        C0414a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(int i10) {
            if (i10 != -1) {
                return i10 != 0 ? String.valueOf(i10) : "RESULT_CANCELED";
            }
            return "RESULT_OK";
        }

        private b() {
        }
    }

    public a(int i10, Intent intent) {
        this.f43196a = i10;
        this.f43197b = intent;
    }

    public final Intent a() {
        return this.f43197b;
    }

    public final int b() {
        return this.f43196a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + f43195c.a(this.f43196a) + ", data=" + this.f43197b + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f43196a);
        dest.writeInt(this.f43197b == null ? 0 : 1);
        Intent intent = this.f43197b;
        if (intent != null) {
            intent.writeToParcel(dest, i10);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}

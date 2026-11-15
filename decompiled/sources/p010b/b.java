package p010b;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface b extends IInterface {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f11483r = "android$support$customtabs$ICustomTabsService".replace('$', '.');

    public static abstract class a extends Binder implements b {

        /* JADX INFO: renamed from: b.b$a$a, reason: collision with other inner class name */
        private static class C0189a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f11484a;

            C0189a(IBinder iBinder) {
                this.f11484a = iBinder;
            }

            @Override // p010b.b
            public boolean C4(p010b.a aVar, Uri uri, Bundle bundle, List list) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f11483r);
                    parcelObtain.writeStrongInterface(aVar);
                    C0190b.d(parcelObtain, uri, 0);
                    C0190b.d(parcelObtain, bundle, 0);
                    C0190b.c(parcelObtain, list, 0);
                    this.f11484a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p010b.b
            public boolean S4(long j10) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f11483r);
                    parcelObtain.writeLong(j10);
                    this.f11484a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p010b.b
            public boolean X2(p010b.a aVar, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f11483r);
                    parcelObtain.writeStrongInterface(aVar);
                    C0190b.d(parcelObtain, bundle, 0);
                    this.f11484a.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p010b.b
            public boolean Z0(p010b.a aVar, Uri uri, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f11483r);
                    parcelObtain.writeStrongInterface(aVar);
                    C0190b.d(parcelObtain, uri, 0);
                    C0190b.d(parcelObtain, bundle, 0);
                    this.f11484a.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11484a;
            }

            @Override // p010b.b
            public boolean c5(p010b.a aVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f11483r);
                    parcelObtain.writeStrongInterface(aVar);
                    this.f11484a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p010b.b
            public int f1(p010b.a aVar, String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f11483r);
                    parcelObtain.writeStrongInterface(aVar);
                    parcelObtain.writeString(str);
                    C0190b.d(parcelObtain, bundle, 0);
                    this.f11484a.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p010b.b
            public boolean j5(p010b.a aVar, Uri uri) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f11483r);
                    parcelObtain.writeStrongInterface(aVar);
                    C0190b.d(parcelObtain, uri, 0);
                    this.f11484a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static b J(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(b.f11483r);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C0189a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }
    }

    /* JADX INFO: renamed from: b.b$b, reason: collision with other inner class name */
    public static class C0190b {
        /* JADX INFO: Access modifiers changed from: private */
        public static void c(Parcel parcel, List list, int i10) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                d(parcel, (Parcelable) list.get(i11), i10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void d(Parcel parcel, Parcelable parcelable, int i10) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i10);
            }
        }
    }

    boolean C4(p010b.a aVar, Uri uri, Bundle bundle, List list);

    boolean S4(long j10);

    boolean X2(p010b.a aVar, Bundle bundle);

    boolean Z0(p010b.a aVar, Uri uri, Bundle bundle);

    boolean c5(p010b.a aVar);

    int f1(p010b.a aVar, String str, Bundle bundle);

    boolean j5(p010b.a aVar, Uri uri);
}

package com.bytedance.sdk.openadsdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public interface IFullScreenVideoAdInteractionListener extends IInterface {

    public static class Default implements IFullScreenVideoAdInteractionListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
        public void onAdClose() {
        }

        @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
        public void onAdShow() {
        }

        @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
        public void onAdVideoBarClick() {
        }

        @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
        public void onDestroy() {
        }
    }

    public static abstract class Stub extends Binder implements IFullScreenVideoAdInteractionListener {

        private static class kq implements IFullScreenVideoAdInteractionListener {
            public static IFullScreenVideoAdInteractionListener kq;
            private IBinder oq;

            kq(IBinder iBinder) {
                this.oq = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.oq;
            }

            @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
            public void onAdClose() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener");
                    if (this.oq.transact(4, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onAdClose();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
            public void onAdShow() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener");
                    if (this.oq.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onAdShow();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
            public void onAdVideoBarClick() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener");
                    if (this.oq.transact(3, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onAdVideoBarClick();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
            public void onDestroy() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener");
                    if (this.oq.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onDestroy();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener");
        }

        public static IFullScreenVideoAdInteractionListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IFullScreenVideoAdInteractionListener)) ? new kq(iBinder) : (IFullScreenVideoAdInteractionListener) iInterfaceQueryLocalInterface;
        }

        public static IFullScreenVideoAdInteractionListener getDefaultImpl() {
            return kq.kq;
        }

        public static boolean setDefaultImpl(IFullScreenVideoAdInteractionListener iFullScreenVideoAdInteractionListener) {
            if (kq.kq != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iFullScreenVideoAdInteractionListener == null) {
                return false;
            }
            kq.kq = iFullScreenVideoAdInteractionListener;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 == 1) {
                parcel.enforceInterface("com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener");
                onDestroy();
                parcel2.writeNoException();
                return true;
            }
            if (i10 == 2) {
                parcel.enforceInterface("com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener");
                onAdShow();
                parcel2.writeNoException();
                return true;
            }
            if (i10 == 3) {
                parcel.enforceInterface("com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener");
                onAdVideoBarClick();
                parcel2.writeNoException();
                return true;
            }
            if (i10 != 4) {
                if (i10 != 1598968902) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeString("com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener");
                return true;
            }
            parcel.enforceInterface("com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener");
            onAdClose();
            parcel2.writeNoException();
            return true;
        }
    }

    void onAdClose();

    void onAdShow();

    void onAdVideoBarClick();

    void onDestroy();
}

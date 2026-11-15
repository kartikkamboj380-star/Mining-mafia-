package com.miningmafia.app.ui.withdrawal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.miningmafia.app.R;
import com.miningmafia.app.databinding.FragmentWithdrawalBinding;
import com.miningmafia.app.data.db.SavedWithdrawalDestination;
import com.miningmafia.app.data.remote.model.WithdrawalRequest;
import com.miningmafia.app.data.repo.WithdrawalRepository;
import com.miningmafia.app.app.MiningMafiaApplication;
import java.util.ArrayList;
import java.util.List;

/**
 * Withdrawal screen: destination address, network, currency, amount, min/available,
 * confirmation before submission, saved destinations (protected & editable).
 */
public class WithdrawalFragment extends Fragment {

    private static final double MIN_WITHDRAWAL = 0.001;
    private static final double AVAILABLE_BALANCE = 0.05;

    private FragmentWithdrawalBinding binding;
    private WithdrawalRepository withdrawalRepository;
    private DestinationAdapter adapter;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentWithdrawalBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        withdrawalRepository = MiningMafiaApplication.getContainer().getWithdrawalRepository();

        adapter = new DestinationAdapter(new ArrayList<>());
        binding.recyclerDestinations.setLayoutManager(new LinearLayoutManager(requireContext()));
        binding.recyclerDestinations.setAdapter(adapter);

        binding.txtMin.setText("Minimum: " + MIN_WITHDRAWAL);
        binding.txtAvail.setText("Available: " + AVAILABLE_BALANCE);

        binding.btnAddDestination.setOnClickListener(v -> showAddDestinationDialog());
        binding.btnSubmit.setOnClickListener(v -> submitWithdrawal());

        loadDestinations();
    }

    private void loadDestinations() {
        withdrawalRepository.loadSavedDestinations(new WithdrawalRepository.Callback() {
            @Override
            public void onWithdrawals(java.util.List<com.miningmafia.app.data.remote.model.WithdrawalRequest> withdrawals) {}

            @Override
            public void onCreated(com.miningmafia.app.data.remote.model.WithdrawalResponse withdrawal) {}

            @Override
            public void onSavedDestinations(List<SavedWithdrawalDestination> destinations) {
                adapter.submitList(destinations);
            }

            @Override
            public void onError(String message) {
                Toast.makeText(requireContext(), message, Toast.LENGTH_LONG).show();
            }
        });
    }

    private void showAddDestinationDialog() {
        android.widget.EditText label = new android.widget.EditText(requireContext());
        label.setHint("Label (e.g. My Wallet)");
        android.widget.EditText addr = new android.widget.EditText(requireContext());
        addr.setHint("Destination Address");
        android.widget.EditText network = new android.widget.EditText(requireContext());
        network.setHint("Network (e.g. BTC, ERC20)");
        android.widget.EditText currency = new android.widget.EditText(requireContext());
        currency.setHint("Currency (e.g. BTC)");

        android.widget.LinearLayout layout = new android.widget.LinearLayout(requireContext());
        layout.setOrientation(android.widget.LinearLayout.VERTICAL);
        layout.addView(label);
        layout.addView(addr);
        layout.addView(network);
        layout.addView(currency);

        new MaterialAlertDialogBuilder(requireContext())
                .setTitle("Add Saved Destination")
                .setView(layout)
                .setPositiveButton("Save", (d, w) -> {
                    SavedWithdrawalDestination dest = new SavedWithdrawalDestination();
                    dest.label = label.getText().toString().trim();
                    dest.destinationAddress = addr.getText().toString().trim();
                    dest.network = network.getText().toString().trim();
                    dest.currency = currency.getText().toString().trim();
                    dest.isDefault = false;
                    withdrawalRepository.saveDestination(dest, new WithdrawalRepository.Callback() {
                        @Override
                        public void onWithdrawals(java.util.List<WithdrawalRequest> withdrawals) {}
                        @Override
                        public void onCreated(com.miningmafia.app.data.remote.model.WithdrawalResponse withdrawal) {}
                        @Override
                        public void onSavedDestinations(List<SavedWithdrawalDestination> destinations) {
                            adapter.submitList(destinations);
                            Toast.makeText(requireContext(), "Destination saved", Toast.LENGTH_SHORT).show();
                        }
                        @Override
                        public void onError(String message) {
                            Toast.makeText(requireContext(), message, Toast.LENGTH_LONG).show();
                        }
                    });
                })
                .setNegativeButton("Cancel", null)
                .show();
    }

    private void submitWithdrawal() {
        String dest = getText(binding.destField);
        String network = getText(binding.networkField);
        String currency = getText(binding.currencyField);
        String amountStr = getText(binding.amountField);

        if (dest.isEmpty() || network.isEmpty() || currency.isEmpty() || amountStr.isEmpty()) {
            Toast.makeText(requireContext(), "All fields are required", Toast.LENGTH_LONG).show();
            return;
        }
        double amount;
        try {
            amount = Double.parseDouble(amountStr);
        } catch (NumberFormatException e) {
            Toast.makeText(requireContext(), "Invalid amount", Toast.LENGTH_LONG).show();
            return;
        }

        WithdrawalRequest request = new WithdrawalRequest();
        request.destinationAddress = dest;
        request.network = network;
        request.currency = currency;
        request.amount = amount;

        new android.app.AlertDialog.Builder(requireContext())
                .setTitle("Confirm Withdrawal")
                .setMessage(String.format(getString(R.string.withdrawal_confirm_msg), amount, dest, network))
                .setPositiveButton("Confirm", (d, w) -> {
                    withdrawalRepository.createWithdrawal(
                            MiningMafiaApplication.getContainer().getAuthRepository(),
                            request, MIN_WITHDRAWAL, AVAILABLE_BALANCE,
                            new WithdrawalRepository.Callback() {
                                @Override
                                public void onWithdrawals(java.util.List<WithdrawalRequest> withdrawals) {}
                                @Override
                                public void onCreated(com.miningmafia.app.data.remote.model.WithdrawalResponse withdrawal) {
                                    Toast.makeText(requireContext(), R.string.withdrawal_submitted, Toast.LENGTH_LONG).show();
                                }
                                @Override
                                public void onSavedDestinations(List<SavedWithdrawalDestination> destinations) {}
                                @Override
                                public void onError(String message) {
                                    Toast.makeText(requireContext(), message, Toast.LENGTH_LONG).show();
                                }
                            });
                })
                .setNegativeButton("Cancel", null)
                .show();
    }

    private String getText(com.google.android.material.textfield.TextInputLayout layout) {
        android.widget.EditText edit = layout.getEditText();
        return edit != null ? edit.getText().toString().trim() : "";
    }

    private static class DestinationAdapter extends RecyclerView.Adapter<DestinationAdapter.ViewHolder> {
        private List<SavedWithdrawalDestination> items = new ArrayList<>();
        DestinationAdapter(List<SavedWithdrawalDestination> items) { this.items = items; }
        void submitList(List<SavedWithdrawalDestination> list) { this.items = list != null ? list : new ArrayList<>(); notifyDataSetChanged(); }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_2, parent, false);
            return new ViewHolder(v);
        }
        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            SavedWithdrawalDestination d = items.get(position);
            holder.txt1.setText(d.label);
            holder.txt2.setText(d.destinationAddress + " · " + d.network + " · " + d.currency);
        }
        @Override
        public int getItemCount() { return items.size(); }
        static class ViewHolder extends RecyclerView.ViewHolder {
            android.widget.TextView txt1, txt2;
            ViewHolder(View v) { super(v); txt1 = v.findViewById(android.R.id.text1); txt2 = v.findViewById(android.R.id.text2); }
        }
    }
}

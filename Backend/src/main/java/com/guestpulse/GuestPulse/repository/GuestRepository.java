package com.guestpulse.GuestPulse.repository;
import com.guestpulse.GuestPulse.Model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, Long> {
}
package com.kovan.intern.javatraining.dto;

public class PrimeResponse {
    private int limit;
    private int[] primes;
    
    public int getLimit() { return limit; }
    public void setLimit(int limit) { this.limit = limit; }
    
    public int[] getPrimes() { return primes; }
    public void setPrimes(int[] primes) { this.primes = primes; }
}

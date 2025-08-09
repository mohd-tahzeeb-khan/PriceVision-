# PriceVision-
PriceVision is a Spring Boot–powered real-time competitor pricing dashboard that scrapes prices, analyzes trends, and uses AI for optimal pricing recommendations. Features include JWT security, MongoDB storage, alerts, scheduling, and CSV/Excel exports for actionable market insights.


PriceVision – Real-Time Competitor Pricing Intelligence Dashboard
PriceVision is a high-performance Spring Boot–powered API and dashboard that empowers businesses with actionable pricing insights through automation, web scraping, and AI-driven recommendations.

The system continuously fetches competitor product prices from multiple sources, stores historical data in MongoDB, analyzes pricing trends, and recommends optimal pricing strategies to maximize market competitiveness. Users can receive real-time alerts, view interactive analytics, and download CSV/Excel reports — all from one central platform.

Key Features
Real-Time Competitor Price Tracking – Automated web scraping from multiple sources using Jsoup.

AI-Driven Pricing Recommendations – Integrates with Hugging Face models for intelligent strategy suggestions.

Historical Trend Analysis – Track and compare price changes over time.

Automated Scheduling – Daily or custom frequency data fetching with Spring Scheduling.

Secure API – JWT authentication with Spring Security.

Data Storage – MongoDB for fast, scalable price data storage.

Alerts & Notifications – Instant alerts to the frontend via WebSocket/SSE.

Downloadable Reports – Export insights as CSV or Excel files.

Performance Optimized – Caching, async processing, and actuator health checks.

Tech Stack
Backend: Spring Boot, Spring Web, Spring Security (JWT), Spring Data MongoDB, Spring Scheduling, WebSocket, Spring Cache.

Data Processing: Jsoup, Apache POI, OpenCSV, Micrometer.

AI Integration: Hugging Face API (WebClient).

Database: MongoDB.

Authentication: JWT-based security.

Use Cases
E-commerce stores monitoring competitor prices.

Retail chains optimizing pricing for maximum profitability.

SaaS providers integrating pricing insights into existing platforms.
